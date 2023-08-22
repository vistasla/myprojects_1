// JavaScript Document
x=0,y=0,x1=0,y1=0;
function mousemove(){
var	drawing=document.getElementById("drawing");	

	if(drawing.getContext){
		var context=drawing.getContext("2d");	
        var image1=document.images[0];
		 x1=event.clientX;
	     y1=event.clientY;
		 
			
		//context.drawImage(image1,x1-x,y1-y);	
		context.clear;
		context.drawImage(image1,x1-x,y1-y);
		}
	
}

function mousedown(){
	 x=event.clientX;
	 y=event.clientY;
	console.log(x+","+y);
	}