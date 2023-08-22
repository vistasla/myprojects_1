// JavaScript Document
function drawimage() {
	var drawing=document.getElementById("drawing");
	if(drawing.getContext){
		
		var ctx=drawing.getContext("2d");
		    image=document.images[0],	
			
		ctx.drawImage(image,0,0);
		
		}
}
function scale() {
 var drawing=document.getElementById("drawing");
 var ctx=drawing.getContext("2d");
 //ctx.scale(0.3, 0.3);
 //console.log(ctx.width+","+ctx.height);
 //ctx.rotate(Math.PI/2);
 ctx.scale(-1, 1);
 ctx.drawImage(image,0,0);
 }