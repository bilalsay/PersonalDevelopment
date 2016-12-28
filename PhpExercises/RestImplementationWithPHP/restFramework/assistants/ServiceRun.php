<?php

namespace assistants;

use assistants\Request;
use assistants\Response;

class ServiceRun
{
    public function __construct(Request $request)
    {
        
        $class = ucfirst($request->dataGet('_service')).'Service';
        $action = lcfirst($request->dataGet('_action')).$request->dataGet('_methodType').'Action';
        
        $servicePath = PATH.'/services/'.$class.'.php';
        
        if (file_exists($servicePath)) {
            $serviceNamespace = '\services\\'.$class;
            
            
            $service = new $serviceNamespace($request);
            
            
            $successData = array(
                    'code' => '200',
                    'codeMessage' => 'OK',
                    'contentType' => 'application/json',
                    'jsonData' => $service->{$action}()
                    );
            
            new Response($successData);
            
        } else {
            $exceptionData = array(
                    'code' => '403',
                    'codeMessage' => 'Forbidden'
                    );
            new Response($exceptionData);
        }

        $service = new $class();
        $service->{$action}($request);        
        
    }
}