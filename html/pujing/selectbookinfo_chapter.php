
<?php
$bookname=$_GET["bookname"];
$query="select * from bookinfo where bookname='".$bookname."'";
$link = mysqli_connect("localhost","pujing","123456","pujing");
$result =mysqli_query (  $link ,  $query  );
if($row = mysqli_fetch_row($result)){
		
		$chaptercount= $row[1];
		
      echo $chaptercount  ;
	   }
			else{
			echo 0;
				}
		 mysqli_free_result($result);
		 mysqli_close($link);	
?>
