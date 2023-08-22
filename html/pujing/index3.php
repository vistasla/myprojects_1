<?php
$value = 'test';
echo 'test';
setcookie("username", $value,time()+3600);
//setcookie("TestCookie2", $value, time()+3600, "/~rasmus/", "localhost", false);
setcookie("TestCookie2", $value."1", time()+3600, '/php/');
?>