// JavaScript Document
function drawimage() {
	var drawing=document.getElementById("drawing");
	if(drawing.getContext){
		
		var context=drawing.getContext("2d");
		context.beginPath();
		context.arc(100,100,99,0,2*Math.PI,false);
		
		context.fillStyle="#ff0000";
		context.fill();
		//context.fillRect(10,10,50,50);
		}
}