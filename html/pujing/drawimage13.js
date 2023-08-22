// JavaScript Document
x,y,x1,y1;
function mousemove(){
	var drawing=document.getElementById("drawing");
	if(drawing.getContext){
		 x1=event.X;
	     y1=event.Y;
		 
		var context=drawing.getContext("2d");	
		var image1=document.images[0];		
		context.drawImage(image1,x1-x,y1-y);	
		
		}
	
}

function mousedown(){
	 x=event.X;
	 y=event.Y;
	console.log(x+","+y);
	}