<?php

class Service 
{
    public function setHeaders($headers)
    {
        header("HTTP/1.1 " . $headers['code'] . " " . $headers['codeMessage']);
        header("Content-Type:" . $headers['contentType']);
    }
}