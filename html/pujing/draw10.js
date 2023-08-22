// JavaScript Document
function draw() {
  var ctx = document.getElementById('drawing').getContext('2d'); 
  ctx.beginPath(); 
  ctx.arc(50, 50, 30, 0, Math.PI*2, true);
  ctx.arc(50, 50, 15, 0, Math.PI*2, true);
 /* ctx.fill("evenodd");*/  
  ctx.fill("nonzero");
}
function draw1() {
  var ctx = document.getElementById('drawing1').getContext('2d'); 
  ctx.beginPath(); 
  ctx.arc(50, 50, 30, 0, Math.PI*2, true);
  ctx.arc(50, 50, 15, 0, Math.PI*2, true);
  ctx.fill("evenodd");  
 
}