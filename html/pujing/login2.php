<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script>function login() {
	
<?php 
//$username=$_POST["username"];
//$password=$_POST["password"];

$link = mysqli_connect("localhost","pujing","123456","pujing");
$query="select * from user where username='test4' and password='123456'";
if($result =mysqli_query (  $link ,  $query  )){
		echo "sucecess";
		$row = mysqli_num_rows($result);
		echo $row;
		}	
    ?>	
	
	console.log("test");			
	}</script>
<title>无标题文档</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="login2.php">
  <input type="text" name="username" id="username" />
  <input type="password" name="password" id="password" />
  <input type="submit" name="submmit" id="submmit" value="提交" onclick="login()" />
</form>
</body>
</html>

