<?php
ini_set("display_errors", 1);

echo $_SERVER['PHP_AUTH_DIGEST'];

exit;
// güvenli curl isteği

curl_setopt($curl, CURLOPT_HTTPHEADER, array("Authorization: Basic " . base64_encode("test:test")));
curl_setopt($curl, CURLOPT_URL, $url);
curl_setopt($curl, CURLOPT_RETURNTRANSFER, 1);

curl_setopt($process, CURLOPT_HTTPHEADER, array('Content-Type: application/xml', $additionalHeaders));
curl_setopt($process, CURLOPT_HEADER, 1);
curl_setopt($process, CURLOPT_USERPWD, $username . ":" . $password);
curl_setopt($process, CURLOPT_TIMEOUT, 30);
curl_setopt($process, CURLOPT_POST, 1);
curl_setopt($process, CURLOPT_POSTFIELDS, $payloadName);
curl_setopt($process, CURLOPT_RETURNTRANSFER, TRUE);
$return = curl_exec($process);
curl_close($process);

// burası site tarafından yapılan istek 
function callServiceWithPostParameters($servicename, $parameters) {
    $strCookie = 'PHPSESSID=' . $_COOKIE['PHPSESSID'] . '; path=/';
    session_write_close();
    $ch = curl_init();
    curl_setopt($ch, CURLOPT_COOKIE, $strCookie);
    curl_setopt($ch, CURLOPT_URL, RESTSERVICEPATH . $servicename);
    curl_setopt($ch, CURLOPT_POST, count($parameters));
    curl_setopt($ch, CURLOPT_POSTFIELDS, createPostQuery($parameters));
    curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
    $response = curl_exec($ch);
    $http_status = curl_getinfo($ch, CURLINFO_HTTP_CODE);
    curl_close($ch);
    return array('result' => json_decode($response),
        'resultcode' => $http_status);
}

function createPostQuery($paramArray) {
    $param_string = '';
    foreach ($paramArray as $key => $value) {
        $param_string .= $key . '=' . $value . '&';
    }
    return rtrim($param_string, '&');
}

// Burası rest tarafında gelen isteği işleme
$istekTipi = $_SERVER['REQUEST_METHOD'];
function set_headers() {
    header("HTTP/1.1 " . $this->_code . " " . $this->get_status_message());
    header("Content-Type:" . $this->_content_type);
}

return json_encode($result);
array(
    100 => 'Continue',
    101 => 'Switching Protocols',
    200 => 'OK',
    201 => 'Created',
    202 => 'Accepted',
    203 => 'Non-Authoritative Information',
    204 => 'No Content',
    205 => 'Reset Content',
    206 => 'Partial Content',
    300 => 'Multiple Choices',
    301 => 'Moved Permanently',
    302 => 'Found',
    303 => 'See Other',
    304 => 'Not Modified',
    305 => 'Use Proxy',
    306 => '(Unused)',
    307 => 'Temporary Redirect',
    400 => 'Bad Request',
    401 => 'Unauthorized',
    402 => 'Payment Required',
    403 => 'Forbidden',
    404 => 'Not Found',
    405 => 'Method Not Allowed',
    406 => 'Not Acceptable',
    407 => 'Proxy Authentication Required',
    408 => 'Request Timeout',
    409 => 'Conflict',
    410 => 'Gone',
    411 => 'Length Required',
    412 => 'Precondition Failed',
    413 => 'Request Entity Too Large',
    414 => 'Request-URI Too Long',
    415 => 'Unsupported Media Type',
    416 => 'Requested Range Not Satisfiable',
    417 => 'Expectation Failed',
    500 => 'Internal Server Error',
    501 => 'Not Implemented',
    502 => 'Bad Gateway',
    503 => 'Service Unavailable',
    504 => 'Gateway Timeout',
    505 => 'HTTP Version Not Supported');

function setProcess(){
        $request_method = strtoupper($_SERVER['REQUEST_METHOD']);
        switch ($request_method)
        {
            case 'GET':
                $this->_DATA = $_GET;
                break;
            case 'POST':
                 $this->_DATA = $_POST;
                break;
            case 'PUT':
            case 'DELETE':
                 parse_str(file_get_contents('php://input'), $put_vars);
                 $this->_DATA = $put_vars;
                break;
        }
 
        $this->_METHOD=$request_method;
        if(isset($this->_DATA['data']))
        {
             $this->_DATA=(json_decode($this->_DATA['data']));
        }
    }