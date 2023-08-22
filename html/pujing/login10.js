// JavaScript Document
//form=document.getElementById("form1");
function login() {
form=document.getElementById("form1");
//var form=document.getElementById("form1");
//var url1="index.php";
var url1="hello world.php";
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


 if(row==1){
	//form.action="setcookie.php";
	setcookie();
	document.getElementById("label1").textContent=form[0].value;	
	
	//window.open(url1,"_self");
	
	 }
	 else{
		 document.getElementById("label1").textContent= "failed";
		 }
 
 } 
}

	
	}
	//var CookieUtil { 
	class CookieUtil { 
  get:function(name) {
    var cookieName = encodeURIComponent(name)+"=",
        cookieStart = document.cookie.indexOf(cookieName),
        cookieValue = null;
            
    if (cookieStart > -1){
      var cookieEnd = document.cookie.indexOf(";", cookieStart);
      if (cookieEnd == -1){
        cookieEnd = document.cookie.length;
      }
      cookieValue = decodeURIComponent(document.cookie.substring(cookieStart 
          + cookieName.length, cookieEnd));
      } 
                   
      return cookieValue;
    },
    
     set:function(name, value, expires, path, domain, secure) {
      var cookieText = 
        encodeURIComponent(name)+"="+encodeURIComponent(value);
    
      if (expires instanceof Date) {
        cookieText += "; expires=" +expires.toGMTString();
      }
    
      if (path) {
        cookieText += `; path=" +path;
      }
    
      if (domain) {
        cookieText += `; domain=" +domain;
      }
    
      if (secure) {
        cookieText += "; secure";
      }
    
      document.cookie = cookieText;
    },

     unset:function(name, path, domain, secure) {
      CookieUtil.set(name, "", new Date(0), path, domain, secure);
  }  
};           

	function setcookie() {
		
		//alert("hello world");
		//document.cookie="name=test;domain=jhjhbh.site";
		//var username=document.getElementById("label1").textContent=form[0].value;
		//document.cookie="name="+form[0].value
		CookieUtil.set("name","test");
		;
		
		
	}
	