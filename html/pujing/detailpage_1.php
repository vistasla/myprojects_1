<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="login4_2_1.js"></script>
<title>无标题文档</title>
<style type="text/css">
#navigate {
	background-color: #CCC;
	height: 40px;
}
button{
	display: inline-block;
	background-color:#0F6;
	height: 20px;
}
#content {
	background-color: #9F9;
	height: 800px;
	overflow: scroll;	
}
</style>
</head>
<body>
<?php
$username=$_COOKIE["username"];
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

<div id="content">此处显示  id "content" 的内容</div>
<div id="navigate">
  <button>previous</button>
  <button onclick="loadnextpage()">next</button>
</div>
</body>
</html>