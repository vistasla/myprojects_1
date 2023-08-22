
<?php
//$username=$_POST["username"];
//$password=$_POST["password"];
//$mail=$_POST["mail"];
$username="test4";
$password="123456";
$mail="mail";

$insert="INSERT INTO user (username,password ,mail,day,test)VALUES ('".$username."', '".$password."','".$mail."','4','test2')";
$link = mysqli_connect("localhost","pujing","123456","pujing");
$result =mysqli_query (  $link ,  $insert );
//echo $result;
$row= mysqli_affected_rows ( $link ) ;
echo $row;
//var_dump($result);
?>

