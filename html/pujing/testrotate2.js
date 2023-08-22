// JavaScript Document
function drawimage() {
	i=0;
    canvas=document.getElementById("drawing");
	if(canvas.getContext){		
		ctx=canvas.getContext("2d");
		canvas.width=800;
        canvas.height=800;
	    image=document.images[0];  
		
        ctx.drawImage(image,
                200,200,400,400);
		}
}
function rotate() {     
// ctx.translate(400, 400);
i++;
if(i==1){
	 ctx.translate(400, 400);
	}

 ctx.rotate(Math.PI*2/4);
 ctx.drawImage(image,
                200-400,200-400,400,400);

 }
 function rotate1() {     
ctx.rotate(-Math.PI*2/4);
ctx.translate(-400, -400);

 ctx.drawImage(image,
                200,200,400,400);
 }
 function rotate2() {     
ctx.translate(400, 400);
ctx.rotate(Math.PI*2/4);
 ctx.drawImage(image,
                200-400,200-400,400,400);

 }