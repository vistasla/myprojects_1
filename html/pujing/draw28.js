// JavaScript Document
function draw() {
  var canvas = document.getElementById('drawing');  
  var canvas1 = document.getElementById('drawing1'); 
  var image=document.images[0];
  /*var image=document.images[0].length;
 var width= image.width;
 var height= image.height;
  console.log(width+","+height);
  console.log(image);*/
  var ctx = canvas.getContext('2d');
  var ctx1 = canvas1.getContext('2d');
  ctx.drawImage(image,0,0);

  var ImageData= ctx.getImageData(0, 0, 50, 50); 
  ctx1.putImageData(ImageData, 0, 0);   
 /*var ctx = canvas.getContext('2d');
 ctx.drawImage(image,0,0);*/
 var image1=document.createElement("img");
 image1.src= canvas.toDataURL("image/png");
 document.body.appendChild(image1);
 
 
 }
 
 function draw1() {
	
}
function draw2() {
 
}
