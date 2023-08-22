// JavaScript Document
x=200,y=200;
i=0;
scale1=0.8;
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
   if(i==0){
	   ctx.translate(x, y);
	   }
   
   i=i+1;
   console.log(i);
   // ctx.translate(x*2*(i-1), y*2*(i-1));
	//ctx.translate(x*2*(i), y*2*(i));
	
	
		//ctx.translate(x/4+100, y/4+100);
		//ctx.translate(100, 100);
		//ctx.translate(40, 40);
		var scale2=(1-scale1)/2;
		ctx.translate(400*scale2, 400*scale2);

		
	
 ctx.scale(scale1, scale1);
 var image=document.images[0];  

 
 ctx.drawImage(image,
                0,0,400,400,0,0,400,400);

 }