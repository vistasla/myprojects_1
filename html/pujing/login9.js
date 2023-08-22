// JavaScript Document
function login() {
	//console.log(navigator.onLine);
	//console.log("test");
	
var form=document.getElementById("form1");
//var url1="index.php";
var url1="index_1.php";
var xmlHttp=new XMLHttpRequest();
var url="login23.php"
xmlHttp.onreadystatechange=stateChanged 
xmlHttp.open("POST",url,true)

xmlHttp.send(new FormData(form));
	
	function stateChanged() 
{ 
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
 { 
//console.log("test");
//document.getElementById("label1").textContent=xmlHttp.responseText ;
var row= xmlHttp.responseText ;
//console.log(row);

 if(row==1){
	// document.getElementById("label1").textContent="sucecess" ;
	document.getElementById("label1").textContent=form[0].value;	
	 window.open(url1,"_self");
	 //form.method("POST");
	// form.action("index.php");
	// form.submit();
	//form.method="POST";
	
	  //window.open(url1,"_top");
	  // window.open(url1,"_parent");
	   // window.open(url1,"_blank");
	 }
	 else{
		 document.getElementById("label1").textContent= "failed";
		 }
 //document.getElementById("label1").text="test" ;
 } 
}

	
	}