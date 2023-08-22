
<?php
$bookname=$_GET["bookname"];
$chapternumber=$_GET["chapternumber"];

/*if(0<=$chapternumber&&$chapternumber<=0){
	
	}else{
		
		
		}*/

$filepath = 'uploads/'.$bookname.'/chapter_'.$chapternumber.'.txt';
//echo $filepath;
//$uploadfile = $uploaddir . basename($_FILES['file1']['name']);
$strContent=file_get_contents($filepath);
echo $strContent;

?>

