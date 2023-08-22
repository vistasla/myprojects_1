// JavaScript Document
var handler=function test(){

 alert("button");

 }
 var handler_1=function test_div(){

 alert("div");

 }
 var handler_2=function test_win(){

 alert("win");

 }
 var handler_3=function test_button_1(){

 alert("button_1");

 }
var button_0=document.getElementById("test");	
var div=document.getElementById("test_1");	
var button_1=document.getElementById("test_2");	
button_0.addEventListener("click",handler,true);
div.addEventListener("click",handler_1,true);	
button_1.addEventListener("click",handler_3,true);
window.addEventListener("click",handler_2,true);
//div.addEventListener("click",handler,true);	
//window.addEventListener("click",handler_1,false);
//window.addEventListener("click",handler_1,true);

//window.addEventListener("click",handler_1,false);
/*div.addEventListener("click",handler,true);	
window.onclick=handler_1;*/

/*window.addEventListener("click",handler_1,false);
div.addEventListener("click",handler,false);	*/