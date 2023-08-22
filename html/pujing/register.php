
<?php
$username=$_POST["username"];
$password=$_POST["password"];
$mail=$_POST["mail"];

$insert="INSERT INTO user (username,password ,mail,day,test)VALUES ('".$username."', '".$password."','".$mail."','4','test2')";
$link = mysqli_connect("localhost","pujing","123456","pujing");
$result =mysqli_query (  $link ,  $insert );
echo $result;
?>
