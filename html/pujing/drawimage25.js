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
	 
	 /*ctx.fillStyle ="green";
		ctx.fillRect(0, 0, 100, 100);*/
		
    
		}
}
function scale() {
 var canvas=document.getElementById("drawing");
 var ctx=canvas.getContext("2d");
 ctx.clearRect(0, 0, 800, 800);
 ctx.scale(0.3, 0.3);
 //console.log(ctx.width+","+ctx.height);
 //ctx.rotate(Math.PI/2);
 /*ctx.scale(-1, 1);*/
 
 //ctx.rotate(Math.PI*2/(3*6));
 /*ctx.rotate(Math.PI*2/(6));*/
 ctx.arc(120, 120, 120, 0, Math.PI*2, false);
	 ctx.fillStyle ="blue";
     ctx.fill();
 }