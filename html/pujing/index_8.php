<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
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
			//echo "huanying".$username."zheshinindengludedi".$day."tian";
			echo "huanying".$membertype."zheshinindengludedi".$day."tian";
       // printf ("%s (%s)\n", $row1[3], $row1[1]);
	   }
			else{
			echo "";
				}
		
?>

</body>
</html>