// JavaScript Document
function draw() {
  var canvas = document.getElementById('drawing');   
  var image=document.images[0];
  var ctx = canvas.getContext('2d');
 
  ctx.globalAlpha = 0.2;  
  ctx.drawImage(image,0,0);
  
  var ImageData= ctx.getImageData(50, 50, 200, 200);
  var count= ImageData.data.length/4;
	for( i=0;i<count;i++){
		ImageData.data[(i+1)*4-1]=255;
		
		}
	
	 ctx.putImageData(ImageData, 50, 50);        
 
 }
 
 function draw1() {
	  var canvas = document.getElementById('drawing');   
 
  var ctx = canvas.getContext('2d');
	 ctx.arc(150, 150, 100, 0, Math.PI*2, false);
  // ctx.fillStyle = "rgba(0,0,0,0)";
  ctx.fillStyle = "rgba(0,0,0,255)";	
  ctx.fill();
}
function draw2() {
	var canvas = document.getElementById('drawing');   
  var image=document.images[0];
  var ctx = canvas.getContext('2d');
 ctx.clearRect(0, 0, 300, 300);
  
  ctx.drawImage(image,100,100,100,100);
}
