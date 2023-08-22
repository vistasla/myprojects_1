// JavaScript Document
function draw() {
  var canvas = document.getElementById('drawing');   
  var image=document.images[0];
  var ctx = canvas.getContext('2d');
 
  // Draw slice
  ctx.globalAlpha = 0.2;  
  ctx.drawImage(image,0,0);
       
  
  // Draw frame

 }
 
 function draw1() {
	/*var ImageData= ctx.getImageData(100, 100, 100, 100);
  var count= ImageData.data.length/4;
	for( i=0;i<count;i++){
		ImageData.data[(i+1)*4-1]=255;
		
		}
	
	 ctx.putImageData(ImageData, 100, 100);*/
  var canvas = document.getElementById('drawing');   
 
  var ctx = canvas.getContext('2d');
 
 
  ctx.arc(150, 150, 100, 0, Math.PI*2, false);
	 ctx.fillStyle ="green";
     ctx.fill();
}
function draw2() {
	
}
