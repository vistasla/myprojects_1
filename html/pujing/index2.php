<?php
$value = 'something from somewhere';
echo 'test';
setcookie("TestCookie", $value."2");
setcookie("TestCookie1", $value."1", time()+3600);  /* 1 小时过期  */
//setcookie("TestCookie2", $value, time()+3600, "/~rasmus/", "localhost", false);
setcookie("TestCookie2", $value."1", time()+3600, "/");
?>