// JavaScript Document
function login() {
	//console.log(navigator.online);
	//console.log("test");	
var form=document.getElementById("form1");
var xmlHttp=new XMLHttpRequest();
var url="uploadfile.php";
xmlHttp.onreadystatechange=stateChanged 
xmlHttp.open("POST",url,true)

xmlHttp.send(new FormData(form));
	
	function stateChanged() 
{ 
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
 { 
console.log("test");

var row= xmlHttp.responseText ;


 if(row==1){
	 
	document.getElementById("label1").textContent="sucecess" ;
	
	/*form.method="POST";
	form.action=url1;
	form.submit();
	window.open(url1,"_top");
    window.open(url1,"_parent");
	window.open(url1,"_blank");*/
	 }
	 else{
		// document.getElementById("label1").textContent= "failed";	
		 document.getElementById("label1").textContent=xmlHttp.responseText ;	
		 }
 } 
}

	
	}