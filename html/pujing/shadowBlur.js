// JavaScript Document
function shadowBlur() {
var c=document.getElementById("myCanvas");
var ctx=c.getContext("2d");
ctx.shadowBlur=10;
ctx.shadowColor="black";
ctx.fillStyle="blue";
ctx.fillRect(100,100,100,100);
}