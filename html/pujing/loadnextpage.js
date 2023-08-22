// JavaScript Document
chapternumber=1;
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
/*function opennextpage() {

	window.open(nextpageurl, "_self");
}*/
function loadnextpage() {

var xmlHttp=new XMLHttpRequest();
selectmembertypeurl="selectmembertype.php";
nextpageurl = "readnextpage.php";
xmlHttp.onreadystatechange=stateChanged
xmlHttp.open("GET",selectmembertypeurl,true);
xmlHttp.send();

	function stateChanged()
{
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
 {
var responseText= xmlHttp.responseText ;

 if(responseText==1){
	var xmlHttp_1=new XMLHttpRequest();
	xmlHttp_1.onreadystatechange=stateChanged_1;	
	var	strchapternumber="chapternumber="+chapternumber;	
xmlHttp_1.open("GET",nextpageurl+"?"+strchapternumber,true);
xmlHttp_1.send();
function stateChanged_1()
{
if (xmlHttp_1.readyState==4 || xmlHttp_1.readyState=="complete")
 {	
	 chapternumber=chapternumber+1;	
	 document.getElementById("h1").textContent=chapternumber+1;		  		 
	 document.getElementById("content").textContent=xmlHttp_1.responseText;
 }
 else{
		 document.getElementById("label1").textContent= "loadfailed";
		 }
	
	 }
 }
	 else{
		 document.getElementById("content").textContent= "membertypefailed";
		 }
 }
}
	}

document.addEventListener("load", function (event) {

	alert("hello world");
});

