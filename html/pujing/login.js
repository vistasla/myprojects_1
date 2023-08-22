// JavaScript Document
function login( username, password) {
var xmlHttp=new XMLHttpRequest();
var url="login22.php"
url=url+"?q="+str
url=url+"&sid="+Math.random()
xmlHttp.onreadystatechange=stateChanged 
xmlHttp.open("POST",url,true)
xmlHttp.send(null)
	
	function stateChanged() 
{ 
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
 { 
 var form=document.getElementById("form1");
 xhr.send(new FormData(form));
 document.getElementById("label1").innerHTML=xmlHttp.responseText ;
 } 
}

	
	}