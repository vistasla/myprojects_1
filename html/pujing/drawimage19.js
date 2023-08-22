// JavaScript Document
function drawimage() {
	var drawing=document.getElementById("drawing");
	if(drawing.getContext){
		
		var context=drawing.getContext("2d");
		var int1 =Math.random();
		var int2=Math.floor(int1*10);
		var int3=int2/10;
		var context=drawing.getContext("2d");	
        	
		/*console.log("int3"+int3);
		context.globalAlpha=int3;	
		//context.drawImage(image1,0,0); 
		var int4=context.globalAlpha;
		console.log("int4"+int4);
*/      context.globalAlpha=0.02;
		//context.fillStyle="#CCC";
		context.fillStyle="black";
		context.fillRect(30,30,200,200);
		var int4=context.globalAlpha;
		console.log("int4"+int4);
		
		}
}