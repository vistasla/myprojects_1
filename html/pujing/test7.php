<?php
$value = 'something from somewhere';

setcookie("TestCookie", $value);
setcookie("TestCookie", $value, time()+3600);  /* 1 小时过期  */
setcookie("TestCookie", $value, time()+3600, "/~rasmus/", "example.com", 1);
?>