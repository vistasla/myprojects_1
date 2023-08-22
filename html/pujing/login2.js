// JavaScript Document
function login() {	
	
var form=document.getElementById("form1");
var xmlHttp=new XMLHttpRequest();
var url="login23.php"
xmlHttp.onreadystatechange=stateChanged 
xmlHttp.open("POST",url,true)
xmlHttp.send(new FormData(form));
	
	function stateChanged() 
{ 
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
 { 

var row= xmlHttp.responseText ;
console.log(row);

 if(row==1){
	
	document.getElementById("label1").textContent=form[0].value;	 
	form.method="POST";
	form.action="setcookie.php";
	form.submit();
	  
	// window.open(url1,"_blank");
	 }
 else{
		 document.getElementById("label1").textContent= "failed";
		 
	 }
   } 
 }	
}