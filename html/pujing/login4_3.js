// JavaScript Document

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

	
