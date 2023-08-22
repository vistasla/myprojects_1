var handler=function test(){

 alert("button");

 }
 var handler_1=function test_1(){

 alert("button_1");

 }
 var handler_2=function test_2(){

 alert("button_2");

 }
 var handler_3=function test_win(){

 alert("win");
 document.disabled=true;

 }
var button_0=document.getElementById("test");	
var button_1=document.getElementById("test_2");	
var button_2=document.getElementById("test_5");	
button_0.addEventListener("click",handler,true);
button_1.addEventListener("click",handler_1,true);
button_2.addEventListener("click",handler_2,true);
window.addEventListener("click",handler_3,true);