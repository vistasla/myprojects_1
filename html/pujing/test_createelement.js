// JavaScript Document

//begin	
function loadcontent() {
var scriptElement=	document.createElement("script");
scriptElement.setAttribute("src","test_createelement_2.js");


    var parentElement = document.getElementsByTagName("head")[0];
	var childElement=	document.getElementsByTagName("script")[0];	
	parentElement.insertBefore(scriptElement,childElement);
	//scriptlink.replaceChild();
	}
//end