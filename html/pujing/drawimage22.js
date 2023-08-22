// JavaScript Document
function drawimage() {
	var drawing=document.getElementById("drawing");
	if(drawing.getContext){
		var image=document.images[0];
		var context=drawing.getContext("2d");		
        context.drawImage(image,0,0); 
				
		}
}
function drawimage1() {
	var drawing=document.getElementById("drawing");
	var drawing1=document.getElementById("drawing1");
	if(drawing.getContext){
		var image=document.images[0];
		
		var context=drawing.getContext("2d");	
		var context1=drawing1.getContext("2d");
	var image1=	context.drawImage(image,
                0,0,200,200,100,100,100,100);	
        //context1.drawImage(drawing,0,0); 
		context1.drawImage(image1,0,0); 
				
		}
}