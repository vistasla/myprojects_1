// JavaScript Document
x=100,y=100;
i=0;
function drawimage() {
	var canvas=document.getElementById("drawing");
	if(canvas.getContext){
		
		var ctx=canvas.getContext("2d");
		canvas.width=800;
        canvas.height=800;
		var image=document.images[0];  
		
        ctx.drawImage(image,
                0,0,400,400,x,y,400,400);
		}
}
function scale() {
 var canvas=document.getElementById("drawing");
 var ctx=canvas.getContext("2d");
 //ctx.clearRect(0,0,800,800);
 //ctx.translate(200, 200);
 //ctx.translate(100, 100);
  //ctx.translate(100, 100);
   //ctx.translate(x*2, y*2);
   i=i+1;
   console.log(i);
   // ctx.translate(x*2*(i-1), y*2*(i-1));
	//ctx.translate(x*2*(i), y*2*(i));
	if(i==1){
		ctx.translate(x+100, y+100);
		}
		if(i>=2){
		//ctx.translate(x/4+100, y/4+100);
		ctx.translate(x, y);
		}
		
		
	
 ctx.scale(0.5, 0.5);
 var image=document.images[0];  

 
 ctx.drawImage(image,
                0,0,400,400,0,0,400,400);

 }