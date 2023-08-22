// JavaScript Document
function draw() {
  var canvas = document.getElementById('drawing');   
  var image=document.images[0];
  var ctx = canvas.getContext('2d');
 
  ctx.globalAlpha = 0.2;  
  ctx.globalCompositeOperation = "source-in";
  ctx.drawImage(image,0,0);
  ctx.arc(150, 150, 100, 0, Math.PI*2, false);
  // ctx.fillStyle = "rgba(0,0,0,0)";
  ctx.fillStyle = "rgba(0,255,0,255)";	
  ctx.fill();
     
 
 }
 
 function draw1() {
	 var canvas = document.getElementById('drawing'); 
	 var canvas1 = document.getElementById('drawing1');  
  
  var ctx = canvas.getContext('2d');
  var ctx1 = canvas1.getContext('2d');
  var ImageData= ctx.getImageData(50, 50, 200, 200);  
  var count= ImageData.data.length/4;
	for( i=0;i<count;i++){
		ImageData.data[(i+1)*4-1]=255;
		
		}
	
	 ctx1.putImageData(ImageData, 50, 50);    
}
function draw2() {

}
