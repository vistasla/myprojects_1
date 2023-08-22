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
				ctx.save();
		}
}
function scale() {
 var canvas=document.getElementById("drawing");
 var ctx=canvas.getContext("2d");
 ctx.clearRect(0, 0, 800, 800);
  var image=document.images[0];  

 
 ctx.drawImage(image,
                0,0,400,400,400,400,400,400);
				

 }
 function restore() {
 var canvas=document.getElementById("drawing");
 var ctx=canvas.getContext("2d");
ctx.restore();
				

 }