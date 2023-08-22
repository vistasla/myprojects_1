// JavaScript Document
function draw() {
  var canvas = document.getElementById('drawing');   
  var image=document.images[0];
  var ctx = canvas.getContext('2d');
 
 /* ctx.globalAlpha = 0.2;  */
  
  ctx.drawImage(image,0,0);
  
  // ctx.globalCompositeOperation = "destination-in";
   ctx.arc(150, 150, 100, 0, Math.PI*2, false);
  // ctx.fillStyle = "rgba(0,0,0,0)";
  //ctx.fillStyle = "rgba(0,0,0,255)";	
 ctx.strokeStyle = "rgba(0,255,0,0.06)";
 ctx.stroke();
 // ctx.fill();
	//ctx.clip();
 }
 
 function draw1() {
	
}
function draw2() {
	
}
