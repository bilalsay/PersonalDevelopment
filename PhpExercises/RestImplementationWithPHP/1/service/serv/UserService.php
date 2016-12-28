<?php

require __DIR__.'/../Service.php';

class UserService extends Service {
    
    public function userGETAction($par)
    {
        $response = array(
            'name' => $par['name'].' Service GET',
            'jop' => $par['jop']. ' Service GET'
            );
        
        $headers = array(
            'code' => 200,
            'codeMessage' => 'OK',
            'contentType' => 'application/json'
            );
        $this->setHeaders($headers);
        
        echo json_encode($response);
        
    }
    
    public function userPOSTAction($par)
    {
        $response = array(
            'name' => $par['name'].' Service POST',
            'jop' => $par['jop']. ' Service POST'
            );
        
        $headers = array(
            'code' => 200,
            'codeMessage' => 'OK',
            'contentType' => 'application/json'
            );
        $this->setHeaders($headers);
        
        echo json_encode($response);
        
    }
    
    public function userPUTAction($par)
    {
        $response = array(
            'name' => $par['name'].' Service PUT',
            'jop' => $par['jop']. ' Service PUT'
            );
        
        $headers = array(
            'code' => 200,
            'codeMessage' => 'OK',
            'contentType' => 'application/json'
            );
        $this->setHeaders($headers);
        
        echo json_encode($response);
        
    }
    
    public function userDELETEAction($par)
    {
        $response = array(
            'name' => $par['name'].' Service DELETE',
            'jop' => $par['jop']. ' Service DELETE'
            );
        
        $headers = array(
            'code' => 200,
            'codeMessage' => 'OK',
            'contentType' => 'application/json'
            );
        $this->setHeaders($headers);
        
        echo json_encode($response);
        
    }
}