// JavaScript Document
var handler=function test(){

 alert("button");

 }
 var handler_1=function test_win(){

 alert("win");

 }
 var handler_1=function test_win(){

 alert("win");

 }
var button_0=document.getElementById("test_1");	
var div=document.getElementById("test");	
//div.addEventListener("click",handler,true);	
//window.addEventListener("click",handler_1,false);
//window.addEventListener("click",handler_1,true);

//window.addEventListener("click",handler_1,false);
/*div.addEventListener("click",handler,true);	
window.onclick=handler_1;*/
window.addEventListener("click",handler_1,true);
div.addEventListener("click",handler,true);	
/*window.addEventListener("click",handler_1,false);
div.addEventListener("click",handler,false);	*/