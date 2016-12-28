<?php

namespace assistants;

class Response
{    
    public function __construct(array $responseData)
    {
        
        header("HTTP/1.1 {$responseData['code']} {$responseData['codeMessage']}");
        
        if (array_key_exists('jsonData', $responseData)) {
                header("Content-Type:" . $responseData['contentType']);
                echo json_encode ($responseData['jsonData']);
        }        
        
        exit;        
        
    }
    
}