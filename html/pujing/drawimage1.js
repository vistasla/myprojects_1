// JavaScript Document
function drawimage() {
	var drawing=document.getElementById("drawing");
	if(drawing.getContext){
		
		var context=drawing.getContext("2d");
		var image1=document.images[0];
		
		context.fillStyle="#ff0000";
		context.fillRect(30,30,50,50);
		//context.fillRect(10,10,50,50);
		}
}