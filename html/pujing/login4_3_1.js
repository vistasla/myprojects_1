// JavaScript Document
//form=document.getElementById("form1");
function opennextpage() {

var xmlHttp=new XMLHttpRequest();
var selectmembertypeurl="selectmembertype.php";
nextpageurl = "nextpage.php";
xmlHttp.onreadystatechange=stateChanged
xmlHttp.open("GET",selectmembertypeurl,true);
xmlHttp.send();

	function stateChanged()
{
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
 {
var row= xmlHttp.responseText ;

 if(row==1){
	var xmlHttp_1=new XMLHttpRequest();
	xmlHttp.onreadystatechange=stateChanged_1;
xmlHttp_1.open("GET",nextpageurl,true);
xmlHttp_1.send();
function stateChanged_1()
{
if (xmlHttp_1.readyState==4 || xmlHttp_1.readyState=="complete")
 {
	document.getElementById("label1").textContent=form[0].value;
 }
 else{
		 document.getElementById("label1").textContent= "loadfailed";
		 }
	
	 }
 }
	 else{
		 document.getElementById("label1").textContent= "failed";
		 }
 }
}
	}

	
function opennextpage() {
	nextpageurl = "nextpage.php";
	window.open(nextpageurl, "_self");
}