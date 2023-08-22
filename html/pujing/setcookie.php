<?php
$value = 'something from somewhere';
echo 'test';
$return=setcookie("TestCookie", $value);
echo $return;
//setcookie("TestCookie", $value, time()-3600);  /* 1 小时过期  */
//setcookie("TestCookie", $value, time()+3600, "/~rasmus/", "localhost", 1);
?>