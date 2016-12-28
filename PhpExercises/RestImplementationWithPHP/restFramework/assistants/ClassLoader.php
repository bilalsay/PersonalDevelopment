<?php

namespace assistants;

class ClassLoader
{
    
    private $reverseSeparator = '\\';
    private $seperator = '/';
    
    public function register()
    {
        spl_autoload_register(array($this, 'loader'));
    }
    
    public function loader($className)
    {
        $classPath = str_replace($this->reverseSeparator, $this->seperator, $className);
        require realpath('.').'/'.$classPath.'.php';
    }
}