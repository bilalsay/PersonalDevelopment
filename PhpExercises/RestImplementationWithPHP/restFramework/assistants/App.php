<?php

namespace assistants;

use assistants\Request;
use assistants\Material;
use assistants\Response;
use assistants\ServiceRun;

class App
{
    
    public function run()
    {
        $request = new Request();
        $security = new Security($request);    
        
        if (true === $security->auth(new Material())) {
            if (true === $security->usePermits(new Material())) {
                
                new ServiceRun($request);
                
            } else {
                $exceptionData = array(
                    'code' => '403',
                    'codeMessage' => 'Forbidden',
                    'contentType' => 'application/json',
                    'jsonData' => array('info' => 'Bu istek methoduna sahib değilsiniz yada bağlanmak istediğiniz servise iznininz bulunmuyor')
                    );
                new Response($exceptionData);
            }
        } else {
            $exceptionData = array(
                'code' => '403',
                'codeMessage' => 'Forbidden',
                'contentType' => 'application/json',
                'jsonData' => array('info' => 'Kayıtlı tokeniniz bulunmuyor veya bilgileriniz geçerli değil')
                );
            new Response($exceptionData);
        }
        
        
    }
    
}