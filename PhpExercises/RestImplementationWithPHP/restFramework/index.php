<?php

ini_set('display_errors', 1);

require_once __DIR__.'/config/autoload.php';

use assistants\App;

define('PATH', realpath('.')).'/';

$app = new App();
$app->run();
