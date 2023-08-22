// JavaScript Document
//form=document.getElementById("form1");
function login() {
form=document.getElementById("form1");
//var targeturl="index.php";
var targeturl="hello world.php";
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
	setcookie();
	document.getElementById("label1").textContent=form[0].value;

	//window.open(targeturl,"_self");
	 }
	 else{
		 document.getElementById("label1").textContent= "failed";
		 }
 }
}
	}

	function setcookie() {
    var now=new Date();
       // now.setMonth(now.getMonth()+1);
        now.setDate(now.getDate()+7);
        //alert(now.getTimezoneOffset());
		//alert(now);
       // alert(now.toString());
      //alert(now.toDateString());
       //alert(now.toTimeString());
      // alert(now.toLocaleDateString());
      //alert(now.toLocaleTimeString());
      alert(now.toUTCString());
		//document.cookie = "username=" + form[0].value + "; domain = localhost" + "; path = /test/test1" + "; expires = 21-Jan-21 07:10:24 GMT" + ";secure=true";
		//document.cookie = "username=" + form[0].value   + "; expires = 21-Jan-21 07:10:24 GMT" + ";secure=true";
        document.cookie = "username=" + form[0].value   + "; expires = "+now+"" + ";secure=true";
	}