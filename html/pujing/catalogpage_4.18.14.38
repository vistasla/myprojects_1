// JavaScript Document
function loadcontent() {
//alert(this);
//alert(document.activeElement);
//alert(event.currentTarget);
//alert(event.target.class);
//event.target.width=200;
//event.target.height=200;
//event.target.style.backgroundColor="green";

//alert(event.target);
//alert(event.target.value);
//alert(event.target.text);
//alert(event.target.innertext);
//alert(event.target.innerhtml);
//alert(event.target.textContent);
//alert(event.target.tagName);
//alert(event.target.getAttribute("class"));
//alert(event.target.class);
//alert(event.target.className);
event.target.style.background="red";
bookname=document.getElementById("bookname").textContent;
chapternumber=event.target.textContent;

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

}
else{
	if(true){
	

}
else{
	
	
	}
	
	}
}}

}
