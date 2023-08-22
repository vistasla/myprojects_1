// JavaScript Document
//begin	
function xMLHttpRequest(methodtype,actionurl,data){
var xmlHttp=new XMLHttpRequest();
xmlHttp.onreadystatechange=stateChanged
//xmlHttp.open(methodtype,actionurl,true);
xmlHttp.open(methodtype,actionurl,false);
xmlHttp.send(data);

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
indexurl = "index.php"; 

selectuserurl="selectuser.php";
userstate= xMLHttpRequest("POST",selectuserurl,new FormData(form)); ;
if(userstate==1){
	//form.action="setcookie.php";
var username="username";
var value=form[0].value;
	setcookie(username,value);
//setcookie(username+1,value+1);
    document.getElementById("label1").style.background="green";
	document.getElementById("label1").textContent=form[0].value;
	

	window.open(indexurl,"_self");
	 }
	 else{
		
		 document.getElementById("label1").style.background="red";		
		 document.getElementById("label1").textContent= "failed";
		 
		 }

	}
//end	
	
	
//begin	
	function setcookie(username,value) {
    var now=new Date();      
    now.setDate(now.getDate()+7);       		
    //document.cookie = "username=" + form[0].value   + "; expires = "+now+"" + ";secure=true";
      //document.cookie = username +"="+ value   + "; expires = "+now+"" + ";secure=true";
	   document.cookie = username +"="+ value   + "; expires = "+now;
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