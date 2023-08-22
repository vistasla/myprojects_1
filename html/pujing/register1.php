
<?php
//$username=$_POST["username"];
//$password=$_POST["password"];
//$query="select * from user where username='".$username."' and password='".$password."'";
$insert="INSERT INTO user (username,password ,test,test1,day)VALUES ('test4', '123456','test1','test2','4')";

$link = mysqli_connect("localhost","pujing","123456","pujing");
$result =mysqli_query (  $link ,  $insert );
echo $result;
<?php /*?>if($result){
	echo $row;
	}
	else{
		echo $row;
		}<?php */?>
<?php /*?>if($result =mysqli_query (  $link ,  $insert )){		
		$row = mysqli_num_rows($result);
		
		echo $row;
		//mysqli_affected_rows （ mysqli $link ）
		}<?php */?>
?>
