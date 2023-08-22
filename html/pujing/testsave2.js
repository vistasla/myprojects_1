// JavaScript Document
var canvas;
 var ctx;
function drawimage() {
	
	canvas=document.getElementById("drawing");
  ctx=canvas.getContext("2d");
		
		
		canvas.width=800;
  canvas.height=800;
		    ctx.arc(200, 200, 200, 0, Math.PI*2, false);
	 ctx.fillStyle ="green";
     ctx.fill();
		
     
				
		
}
function drawimage1() {

 ctx.clearRect(0, 0, 800, 800);
   ctx.arc(600, 600, 200, 0, Math.PI*2, false);
	 ctx.fillStyle ="blue";
     ctx.fill();

 
 
				

 }
 function save() {
 

		ctx.save();		

 }
 function restore() {
 
ctx.restore();
				

 }