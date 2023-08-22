<?php
$uploaddir = '/uploads/';
$uploadfile = $uploaddir . basename($_FILES['userfile']['name']);
echo $_FILES['userfile']['error'];
<?php /*?>if (move_uploaded_file($_FILES['userfile']['tmp_name'], $uploadfile)) {
    echo "1";
} else {
    echo "0";
}<?php */?>




?>