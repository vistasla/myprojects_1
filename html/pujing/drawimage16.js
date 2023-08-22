// JavaScript Document

function mousemove(){
var	drawing=document.getElementById("drawing");	

	if(drawing.getContext){
		var int1 =Math.random();
		var context=drawing.getContext("2d");	
        context.globalAlpha=0;	
		console.log("test");	 		
		}
	
}

