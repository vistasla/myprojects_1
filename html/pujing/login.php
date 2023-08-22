


<?php 
$username=$_POST["username"];
$password=$_POST["password"];
//mysqli_query ( mysqli $link , string $query [, int $resultmode = MYSQLI_STORE_RESULT ] ) 
$link = mysqli_connect("localhost","pujing","123456","pujing");
//$query="select * from user where username='"+$username+"' and password='"+$password+"'";
//$query="select * from user where  password='"+$password+"'";
//$query="select * from user where  password='123456'";
$query="select * from user where username='"+$username+"'";
if (mysqli_connect_errno()) {
    printf("Connect failed: %s\n", mysqli_connect_error());
    exit();
}
//$query="select * from user where username="+$username+" and password="+$password+"";
//$query="select * from user where username='test4' and password='123456'";
//$query="select * from user where test='test1'";

//if($row = mysqli_fetch_array($result)){
//if($row = mysqli_num_rows($result)){
//if($row = mysqli_num_rows($result)){
	/*if($row = mysqli_fetch_row($result)){		
	//echo $row['username'];
	
	$lengths=mysqli_fetch_lengths($result);
	//echo count($lengths);
	echo $lengths[0];
	echo $lengths[1];
	echo $lengths[2];
	
	
	echo $lengths[3];*/
	/*while($result =mysqli_query (  $link ,  $query  )){
		echo "sucecess";
		}*/
	if($result =mysqli_query (  $link ,  $query  )){
		echo "sucecess";
		$row = mysqli_num_rows($result);
		echo $row;
		}
	/*$result=mysqli_query (  $link ,  $query  );
	echo $result;*/
/*if(mysqli_query (  $link ,  $query  )){
	
		echo "sucecess";
		//$row = mysqli_num_rows($result);
		//echo $row;
		}*/
    ?>


