// JavaScript Document
//drawing=document.getElementById("drawing");
drawing;
context;
image1;
function drawimage() {
	drawing=document.getElementById("drawing")
	if(drawing.getContext){		
		 context=drawing.getContext("2d");				
		 image1=document.images[0];		
		context.drawImage(image1,0,0);				
		}
}
function drawimage1() {
	
	context.drawImage(image1,100,100);	
	
}