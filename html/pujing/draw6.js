// JavaScript Document
function draw() {
  var canvas = document.getElementById('drawing'); 
  
  var image=document.images[0];
  var ctx = canvas.getContext('2d');
 
  // Draw slice
  
  ctx.drawImage(image,0,0);
              

  // Draw frame
 // ctx.drawImage(image,0,0);
 }
 
 function draw1() {
	 var canvas = document.getElementById('drawing'); 
	 var canvas1 = document.getElementById('drawing1');
  var ctx1 = canvas1.getContext('2d');
	 var image=document.images[0];
	 var ctx = canvas.getContext('2d');
	 var ImageData= ctx.getImageData(100, 100, 100, 100);
	var count= ImageData.data.length/4;
	for( i=0;i<count;i++){
		ImageData.data[(i+1)*4-1]=127;
		
		}
	 /*ImageData.data[3]=255;*/
	 ctx.putImageData(ImageData, 100, 100);
	/* ctx.drawImage(image, 100, 100, 100, 100, 100, 100, 100, 100);*/
    /* var ctx = canvas.getContext('2d');
	 ctx.opcity=0.1;
	 ctx.arc(150, 150, 100, 0, Math.PI*2, false);
	 ctx.fillStyle ="green";
     ctx.fill();*/
 
}
function draw2() {
	
}
