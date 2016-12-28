<?php

namespace assistants;

class Material
{
    public function parameter($key = false) {
        $parameters = require __DIR__.'/../config/parameters.php';
        
        if (false !== $key)
            return $parameters[$key];
        
        return $parameters;
    }
    
    public function token($key = false) {
        $tokens = require __DIR__.'/../config/tokens.php';
        
        if (false !== $key)
            return $tokens[$key];
        
        return $tokens;
    }
}