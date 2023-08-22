// JavaScript Document

function login() {
form=document.getElementById("form1");
	var targeturl = "index.php";
	var nextpageurl = "nextpage.php";
//var targeturl="hello world.php";
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

	function setcookie(username,value) {

    var now=new Date();      
    now.setDate(now.getDate()+7);       
   
		
        //document.cookie = "username=" + form[0].value   + "; expires = "+now+"" + ";secure=true";
        document.cookie = username +"="+ value   + "; expires = "+now+"" + ";secure=true";
}
/*function opennextpage() {

	window.open(nextpageurl, "_self");
}*/
function loadnextpage() {

var xmlHttp=new XMLHttpRequest();
selectmembertypeurl="selectmembertype.php";
nextpageurl = "nextpage.php";
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
xmlHttp_1.open("GET",nextpageurl,true);
xmlHttp_1.send();
function stateChanged_1()
{
if (xmlHttp_1.readyState==4 || xmlHttp_1.readyState=="complete")
 {
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

	
