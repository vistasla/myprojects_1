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
	 var ctx = canvas.getContext('2d');
	/* ctx.clearHitRegions();*/
 ctx.clearRect(0, 0, 300, 300);
  var image=document.images[0];
  ctx.drawImage(image,0,0,100,100);
}
function draw2() {
	
}
