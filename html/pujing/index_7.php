<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>

<body>
<?php
/*$username=$_POST["username"];
$password=$_POST["password"];*/
//$day;
/*$query="select * from user where username='".$username."' and password='".$password."'";
*/
		$username=$_COOKIE["username"];
		//echo $cookiename;
		//echo "$cookiename";
		$query="select * from user where username='".$username."'";
$link = mysqli_connect("localhost","pujing","123456","pujing");
/*$result =mysqli_query (  $link ,  $query  );
$day=mysqli_fetch_row($result)[3];
$membertype= mysqli_fetch_row($result)[3];
echo "huanying".$username."zheshinindengludedi".$day."tian";*/
if($result =mysqli_query (  $link ,  $query  )){
		$row = mysqli_num_rows($result);

		//echo $row;
		if($row==1){
			$day= mysqli_fetch_row($result)[3];
			$membertype= mysqli_fetch_row($result)[3];
			//echo "huanying".$username."zheshinindengludedi".$day."tian";
			
			}
			else{
				}
		}
?>

</body>
</html>