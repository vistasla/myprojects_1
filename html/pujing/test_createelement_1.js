// JavaScript Document

//begin	
function loadcontent() {
var scriptlink=	document.createElement("link");
scriptlink.setAttribute("href","/test_createelement_1.css");
scriptlink.setAttribute("rel","stylesheet");
scriptlink.setAttribute("type","text/css");

 //alert(scriptlink.outerHTML);
	var childElement=	document.getElementsByTagName("link")[0];
	var parentElement = document.getElementsByTagName("head")[0];

	
	parentElement.insertBefore(scriptlink,childElement);
	//scriptlink.replaceChild();
	}
//end