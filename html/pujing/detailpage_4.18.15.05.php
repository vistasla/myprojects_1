<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="detailpage.js"></script>
<title>无标题文档</title>
<link href="/detailpage.css" rel="stylesheet" type="text/css" />
</head>
<!--<body onload="getcookie()">-->
<body onload="loadnextpage()">
<?php
/*try{
$username=$_COOKIE["username"];}
catch(Exception $e){
	echo "unlogin";
	
	}*/
	set_error_handler("customError");
	$username=$_COOKIE["username"];
	function customError($errno, $errstr)
 { 
 
 echo "<b>Error:</b> [$errno] $errstr<br />";
 echo "unlogin";
 die();
 }
$query="select * from user where username='".$username."'";
$link = mysqli_connect("localhost","pujing","123456","pujing");
$result =mysqli_query (  $link ,  $query  );
if($row = mysqli_fetch_row($result)){
		
		$membertype= $row[2];
		$day= $row[3];
			echo "huanying".$username."zheshinindengludedi".$day."tian";
			//echo "huanying".$membertype."zheshinindengludedi".$day."tian";
      
	   }
			else{
			echo "";
				}
		
?>
<h1 id="h1" align="center">1</h1>
<div id="content">此处显示  id "content" 的内容</div>
<div id="navigate">
  <button>previous</button>
  <button onclick="loadnextpage()">next</button>
</div>
</body>
</html>