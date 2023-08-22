
<?php
$username=$_POST["username"];
$password=$_POST["password"];
$query="select * from user where username='".$username."' and password='".$password."'";
$link = mysqli_connect("localhost","pujing","123456","pujing");
if($result =mysqli_query (  $link ,  $query  )){		
		$row = mysqli_num_rows($result);
		
		echo $row;
		}
?>
