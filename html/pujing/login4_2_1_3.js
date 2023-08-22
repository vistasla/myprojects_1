// JavaScript Document
//begin	
function xMLHttpRequest(methodtype,actionurl){
var xmlHttp=new XMLHttpRequest();
xmlHttp.onreadystatechange=stateChanged
//xmlHttp.open(methodtype,actionurl,true);
xmlHttp.open(methodtype,actionurl,false);
xmlHttp.send();

	function stateChanged()
{
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
 {
 responseText= xmlHttp.responseText ;
 
 }}
 
 return responseText;
 }
//end

//begin	
function login() {
form=document.getElementById("form1");
var targeturl = "index.php"; 
var xmlHttp=new XMLHttpRequest();
var selectuserurl="selectuser.php";

xmlHttp.onreadystatechange=stateChanged
xmlHttp.open("POST",selectuserurl,true)

xmlHttp.send(new FormData(form));

	function stateChanged()
{
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
 {
var row= xmlHttp.responseText ;

 if(row==1){
	//form.action="setcookie.php";
var username="username";
var value=form[0].value;
	setcookie(username,value);
//setcookie(username+1,value+1);
	document.getElementById("label1").textContent=form[0].value;

	window.open(targeturl,"_self");
	 }
	 else{
		 document.getElementById("label1").textContent= "failed";
		 }
 }
}
	}
//end	
	
	
//begin	
	function setcookie(username,value) {

    var now=new Date();      
    now.setDate(now.getDate()+7);       
   
		
        //document.cookie = "username=" + form[0].value   + "; expires = "+now+"" + ";secure=true";
        document.cookie = username +"="+ value   + "; expires = "+now+"" + ";secure=true";
}
//end

//begin	
function getcookie() {

 /* var cookie=document.cookie;
 // alert(typeof cookie);
 alert(cookie.length);
  if(cookie.length!=0){
	  alert(cookie);
	  }else{
		 nextpageurl = "https://cn.bing.com/";
		  window.open(nextpageurl, "_self");
		  }*/
  
document.cookie = "yummy_cookie=choco"; 
document.cookie = "tasty_cookie=strawberry"; 
console.log(document.cookie); 
               
}
//end