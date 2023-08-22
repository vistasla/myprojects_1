// JavaScript Document
function drawimage() {
	var canvas=document.getElementById("drawing");
	if(canvas.getContext){
		
		var ctx=canvas.getContext("2d");
		canvas.width=800;
  canvas.height=800;
		    ctx.arc(200, 200, 200, 0, Math.PI*2, false);
	 ctx.fillStyle ="green";
     ctx.fill();
		
     
				
		}
}
function drawimage1() {
 var canvas=document.getElementById("drawing");
 var ctx=canvas.getContext("2d");
 ctx.clearRect(0, 0, 800, 800);
   ctx.arc(600, 600, 200, 0, Math.PI*2, false);
	 ctx.fillStyle ="blue";
     ctx.fill();

 
 
				

 }
 function save() {
 var canvas=document.getElementById("drawing");
 var ctx=canvas.getContext("2d");

		ctx.save();		

 }
 function restore() {
 var canvas=document.getElementById("drawing");
 var ctx=canvas.getContext("2d");
ctx.restore();
				

 }