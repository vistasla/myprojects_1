<?php
$uploaddir = 'uploads/';
$uploadfile = $uploaddir . basename($_FILES['file1']['name']);
if (move_uploaded_file($_FILES['file1']['tmp_name'], $uploadfile)) {
	//echo $_FILES['file1']['tmp_name'];
	echo $_FILES['file1']['size'];
    echo "1";
} else {
    echo "0";}
//echo $_FILES['userfile']['error'];
//echo $_FILES['userfile']['name'];
//echo $_FILES['name'];
//echo $_FILES['file1']['name'];
?>