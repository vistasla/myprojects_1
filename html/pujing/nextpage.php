
<?php
$filedir = 'uploads/test.txt';
//$uploadfile = $uploaddir . basename($_FILES['file1']['name']);
$strContent=	file_get_contents($filedir)	;
echo $strContent;
?>

