// JavaScript Document
function drawimage() {
	var canvas=document.getElementById("drawing");
	if(canvas.getContext){
		
		var ctx=canvas.getContext("2d");
		canvas.width=800;
  canvas.height=800;
		 var image=document.images[0];  
		
     ctx.drawImage(image,
                0,0,400,400,0,0,400,400);
		}
}
function scale() {
 var canvas=document.getElementById("drawing");
 var ctx=canvas.getContext("2d");
 //ctx.translate(200, 200);
 ctx.translate(100, 100);
 ctx.scale(0.5, 0.5);
  var image=document.images[0];  

 
 ctx.drawImage(image,
                0,0,400,400,0,0,400,400);

 }