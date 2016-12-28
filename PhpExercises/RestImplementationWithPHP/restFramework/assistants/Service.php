<?php

namespace assistants;
use assistants\Request;

class Service 
{
    
    protected $request; 
    
    public function __construct(Request $request)
    {
        $this->request = $request;
    }
}