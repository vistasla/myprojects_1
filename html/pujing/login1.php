<?php 
$username=$_POST["username"];
$password=$_POST["password"];
//echo $username;
//echo $password;
//mysqli_query ( mysqli $link , string $query [, int $resultmode = MYSQLI_STORE_RESULT ] ) 
$link = mysqli_connect("localhost","pujing","123456","pujing");
//$query="select * from user where username='"+$username+"' and password='"+$password+"'";
//$query="select username from user where username='"+$username+"' and password='"+$password+"'";
$query="select * from user where username='test' and password='123456'";
//$query="select username from user where username='test'";
//$query="select username from user where  password='123456'";
//$query="select * from user where username='"+$username+"'";
//$query="select * from user where  password='"+$password+"'";
//$result =mysqli_query (  $link ,  $query  );
/*if($result){
	//mysqli_next_result
	echo $result;
	echo "sucucess";
	
	}*/
	if ($result = mysqli_query($link, $query)) {
   // $row = mysqli_fetch_row($result); 
		
        //printf($row[2]);
		//printf($row[0]);
	//$rowcount=	mysqli_field_tell (  $result ) ;
	/*$rowcount=mysqli_num_fields (  $result ) ;
	printf($rowcount);*/
	$rowcount=mysqli_fetch_lengths(  $result ) ;
	printf($rowcount);
    }
//if (!$con)
/*if ($con)
{echo "sucucess";}*/
 /* {
  die('Could not connect: ' . mysql_error());
  }*/

    ?>