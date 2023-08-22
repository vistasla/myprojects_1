// JavaScript Document
function draw() {
  var canvas = document.getElementById('drawing');   
  var image=document.images[0];
  var ctx = canvas.getContext('2d');
 
  ctx.globalAlpha = 0.2;    
  ctx.drawImage(image,0,0);
     
 }
 
 function draw1() {
	 var canvas = document.getElementById('drawing');   
	 var canvas1 = document.getElementById('drawing1'); 
  var image=document.images[0];
  var ctx = canvas.getContext('2d');
  var ctx1 = canvas1.getContext('2d');
  ctx1.drawImage(image,0,0);
}
function draw2() {
	var canvas = document.getElementById('drawing');   
	 var canvas1 = document.getElementById('drawing1'); 
  
  var ctx = canvas.getContext('2d');
  /* ctx.globalAlpha = 1;*/
 ctx.clearRect(0, 0, 300, 300);

  ctx.drawImage(canvas1,100,100,100,100);
}
