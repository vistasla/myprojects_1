
<?php
$username=$_COOKIE["username"];
$query="select * from user where username='".$username."'";
$link = mysqli_connect("localhost","pujing","123456","pujing");
$result =mysqli_query (  $link ,  $query  );
if($row = mysqli_fetch_row($result)){
		
		
		// echo $username  ;
      echo 1  ;
	   }
			else{
			echo 0;
				}
		 mysqli_free_result($result);
		 mysqli_close($link);	
?>
