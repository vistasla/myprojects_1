// JavaScript Document
function drawimage() {
	var canvas=document.getElementById("drawing");
	if(canvas.getContext){
		
		var ctx=canvas.getContext("2d");
		canvas.width=200;
  canvas.height=200;
		   ctx.arc(50, 50, 50, 0, Math.PI*2, false);
	 ctx.fillStyle ="green";
     ctx.fill();
	 
	 /*ctx.fillStyle ="green";
		ctx.fillRect(0, 0, 100, 100);*/
		
    
		}
}
function scale() {
 var canvas=document.getElementById("drawing");
 var ctx=canvas.getContext("2d");
 ctx.scale(0.3, 0.3);
 //console.log(ctx.width+","+ctx.height);
 //ctx.rotate(Math.PI/2);
 /*ctx.scale(-1, 1);*/
 //ctx.clearRect(0, 0, 200, 200);
 //ctx.rotate(Math.PI*2/(3*6));
 /*ctx.rotate(Math.PI*2/(6));*/
 ctx.arc(30, 30, 30, 0, Math.PI*2, false);
	 ctx.fillStyle ="blue";
     ctx.fill();
 }