// JavaScript Document
function XMLHttpRequest(actionurl,methodtype){
var xmlHttp=new XMLHttpRequest();
xmlHttp.onreadystatechange=stateChanged
xmlHttp.open(methodtype,actionurl,true);
xmlHttp.send();

	function stateChanged()
{
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
 {
 responseText= xmlHttp.responseText ;
 return responseText;
 }}}