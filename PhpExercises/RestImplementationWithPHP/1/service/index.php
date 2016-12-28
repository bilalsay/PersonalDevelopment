<?php
ini_set('display_errors', 1);
define('PATH', realpath('.')).'/';

$keys = (array) require_once __DIR__.'/authenticate/permissions.php';

$requestMethod = strtoupper($_SERVER['REQUEST_METHOD']);

if ($requestMethod == 'PUT' || $requestMethod == 'DELETE'){
    parse_str(file_get_contents('php://input'), $put_vars);
    $request = $put_vars;
} else {
    $requestName = '_'.$requestMethod;
    $request = $$requestName;
}    

if (!isset($request['key'])) {
    header("HTTP/1.1 403 Forbidden");
    exit;
} 

if (!array_key_exists($request['key'], $keys)) {
    header("HTTP/1.1 403 Forbidden");
    exit;
}

if (!in_array($requestMethod, $keys[$request['key']]['useRequest']) && !in_array('*', $keys[$request['key']]['useRequest'])) {
    header("HTTP/1.1 403 Forbidden");
    exit;
}

if ($_SERVER['PHP_AUTH_PW'] != $keys[$request['key']]['keyUserPassword'] || $_SERVER['PHP_AUTH_USER'] != $keys[$request['key']]['keyUserName']){
    header("HTTP/1.1 403 Forbidden");
    exit;
}

if (!in_array($request['c'], $keys[$request['key']]['useServices']) && !in_array('*', $keys[$request['key']]['useServices'])) {
    header("HTTP/1.1 403 Forbidden");
    exit;
}

$class = ucfirst($request['c']).'Service';
$action = lcfirst($request['a']).$requestMethod.'Action';

require_once PATH.'/serv/'.$class.'.php';


$service = new $class();
$service->{$action}($request);


