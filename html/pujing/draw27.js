// JavaScript Document
function draw() {
 
  var canvas1 = document.getElementById('drawing1'); 
  var image=document.images[0];
  
  var ctx1 = canvas1.getContext('2d');
  ctx1.drawImage(image,0,0);

 /*var ImageData= ctx.getImageData(50, 50, 200, 200); 
  ctx1.putImageData(ImageData, 50, 50);   
  var strbackgroundimage=document.getElementById("test").getAttribute("background-image");
 console.log(strbackgroundimage);*/
  //ctx.drawImage(image,0,0);
 
     
 
 }
 
 function draw1() {
	
}
function draw2() {
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
