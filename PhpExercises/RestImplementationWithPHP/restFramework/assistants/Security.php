<?php

namespace assistants;
use assistants\Request;
use assistants\Material;

class Security
{
    
    private $request;
    
    public function __construct(Request $request)
    {
        $this->request = $request;
    }
    
    public function auth(Material $material)
    {
        $tokens = $material->token();
                
        if (
            !empty($this->request->dataGet('_token')) && 
            array_key_exists($this->request->dataGet('_token'), $tokens) &&
            $this->request->dataServerGet('PHP_AUTH_PW') == $tokens[$this->request->dataGet('_token')]['password'] &&
            $this->request->dataServerGet('PHP_AUTH_USER') == $tokens[$this->request->dataGet('_token')]['user']
            ) {
            
            return true;
            
        } 
        
        return false;
    }
    
    public function usePermits(Material $material)
    {
        $tokens = $material->token();
                
        if (
            (in_array($this->request->dataGet('_service'), $tokens[$this->request->dataGet('_token')]['useService']) || in_array('*', $tokens[$this->request->dataGet('_token')]['useService'])) &&    
            (in_array($this->request->dataGet('_methodType'), $tokens[$this->request->dataGet('_token')]['useMethod']) || in_array('*', $tokens[$this->request->dataGet('_token')]['useMethod']))
            ) {
            
            return true;
            
        } 
        
        return false;
    }
}