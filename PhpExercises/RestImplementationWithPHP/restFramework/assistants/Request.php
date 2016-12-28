<?php

namespace assistants;

class Request
{
    
    private $data = array();
        
    public function __construct()
    {
        $method = strtoupper($_SERVER['REQUEST_METHOD']);
        
        if ($method == 'PUT' || $method == 'DELETE'){
            parse_str(file_get_contents('php://input'), $put_vars);
            $data = $put_vars;
        } elseif ($method == 'POST') {
            $data = $_POST;
        } elseif ($method == 'GET') {
            $data = $_GET;
        }
        
        $data['_methodType'] = $method;
        
        $this->data = $data;
    }
    
    public function dataGet($key)
    {
        return $this->data[$key];
    }
    
    public function dataServerGet($key)
    {
        return $_SERVER[$key];
    }
    
}