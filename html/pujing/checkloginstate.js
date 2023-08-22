// JavaScript Document
//begin	
function xMLHttpRequest(methodtype,actionurl){
var xmlHttp=new XMLHttpRequest();
xmlHttp.onreadystatechange=stateChanged
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

function checkloginstate(){

 selectuser_cookieurl="selectuser_cookie.php";
 loginstate= xMLHttpRequest("GET",selectuser_cookieurl);
 return loginstate;

 }