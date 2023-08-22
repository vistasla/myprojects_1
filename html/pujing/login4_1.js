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
	

	function setcookie() {
		
		//alert("hello world");
		//document.cookie="name=test;domain=jhjhbh.site";
		//var username=document.getElementById("label1").textContent=form[0].value;
		//document.cookie = "name=" + form[0].value;
		//document.cookie = "name=" + form[0].value + ";secure=true1" + "; path = /test/test1" + "; expires =2020.4.13" + "; domain =.test.com";
		//document.cookie = "username=" + form[0].value + ";secure=true" + "; path = /test/test1" + "; expires =Mon, 22-Jan-21 07:10:24 GMT";
		//document.cookie = "username=" + form[0].value + ";secure=true" + "; path = /test/test1" + "; expires = 21-Jan-21 07:10:24 GMT" + "; domain = www.localhost.test";
		//document.cookie = "username=" + form[0].value + "; domain = localhost" + "; path = /test/test1" + "; expires = 21-Jan-21 07:10:24 GMT" + ";secure=true";
		Date date = new Date();
		date.
		document.cookie = "username=" + form[0].value   + "; expires = 21-Jan-21 07:10:24 GMT" + ";secure=true";
		//document.cookie += ";" + "domain=.test.com";
		//document.cookie += ";domain=.test.com";
		//document.cookie += ";secure=true1";
		//document.cookie += ";path=/test/test1";
		//document.cookie += ";secure=true";
		
		//document.cookie="name=test; expires=Mon, 22-Jan-21 07:10:24 GMT; domain=.test.com";
		//document.cookie = "name=test; domain=.test.com";
		//document.cookie = encodeURIComponent("name") + "=" + encodeURIComponent("test") + "; domain=.test.com; path=/";
		//var cookie = new CookieUtil;
		//CookieUtil cookieUtil = new CookieUtil();
		//CookieUtil.set("name", "test", new Date(), "test.com", true);
		//CookieUtil.set("name", "test",null,null ,null, true);
		//document.cookie="name=test;name1=.test.com";
		//CookieUtil.set("name","test");
		//var date= Date.now();
		//docu
		//alert(date.toString());
		//alert(date);
		//alert(date.toGMTString());
		//document.cookie="expires="+date.toGMTString();
		//document.cookie="expires="+date.toString();
		
		
	}
	