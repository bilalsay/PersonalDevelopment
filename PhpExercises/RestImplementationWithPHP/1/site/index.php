<?php

ini_set('display_errors', 1);

$parameters = array(
    'name' => 'bilal',
    'jop' => 'Php Developer'
    );

/* Servis get işlemi
$ch = curl_init();
curl_setopt($ch, CURLOPT_URL, 'http://localhost/rest/service/?c=user&a=user&name='.$parameters['name'].'&jop='.$parameters['jop']);
curl_setopt($ch, CURLOPT_CUSTOMREQUEST, 'GET');
curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
$response = curl_exec($ch);
 */

$context = hash_init('sha256', HASH_HMAC, "REST");
hash_update($context, 'bilalsay');
$key = hash_final($context);

$ch = curl_init();
curl_setopt($ch, CURLOPT_USERPWD, 'bilalsay:'.$key);
curl_setopt($ch, CURLOPT_URL, 'http://localhost/rest/service/');
curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
curl_setopt($ch, CURLOPT_CUSTOMREQUEST, 'DELETE');
curl_setopt($ch, CURLOPT_POSTFIELDS, 'key='.$key.'&c=user&a=user&name='.$parameters['name'].'&jop='.$parameters['jop']);
$response = curl_exec($ch);

$http_status = curl_getinfo($ch, CURLINFO_HTTP_CODE);

curl_close($ch);
//echo $http_status;


echo '<pre>';
print_r(json_decode($response, true));

/* header tüm içerikleri
foreach (getallheaders() as $name => $value) {
    echo "$name: $value\n";
}
*/
