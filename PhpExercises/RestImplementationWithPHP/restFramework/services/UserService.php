<?php

namespace services;
use assistants\Service;

class UserService extends Service
{
    
    public function userGETAction()
    {
        $response = array(
            'name' => $this->request->dataGet('name').' Service GET',
            'jop' => $this->request->dataGet('jop'). ' Service GET'
            );
        
        return $response;
        
    }
    
    public function userPOSTAction()
    {
        $response = array(
            'name' => $this->request->dataGet('name').' Service POST',
            'jop' => $this->request->dataGet('jop'). ' Service POST'
            );
        return $response;
        
    }
    
    public function userPUTAction()
    {
        $response = array(
            'name' => $this->request->dataGet('name').' Service PUT',
            'jop' => $this->request->dataGet('jop'). ' Service PUT'
            );
        
        return $response;
        
    }
    
    public function userDELETEAction()
    {
        $response = array(
            'name' => $this->request->dataGet('name').' Service DELETE',
            'jop' => $this->request->dataGet('jop'). ' Service DELETE'
            );
                
        return $response;
        
    }
}