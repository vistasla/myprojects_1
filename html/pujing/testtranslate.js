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
  var image=document.images[0];  
// ctx.translate(400, 400);
 ctx.translate(300, 300);
/* ctx.drawImage(image,
                0,0,400,400,0,0,400,400);*/
ctx.save();
 }