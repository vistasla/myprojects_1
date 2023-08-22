
<?php
$chapternumber=$_GET["chapternumber"];
$filepath = 'uploads/chapter_'.$chapternumber.'.txt';
//echo $filepath;
//$uploadfile = $uploaddir . basename($_FILES['file1']['name']);
$strContent=file_get_contents($filepath);
echo $strContent;


?>

