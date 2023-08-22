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
 var canvas1 = document.getElementById('drawing1');
  var ctx1 = canvas1.getContext('2d');
 var myImageData = ctx.getImageData(0,0,100,100);
 ctx1.putImageData(myImageData, 100, 100);
}
function draw2() {
	 var canvas = document.getElementById('drawing'); 
  var image=document.images[0];
  var ctx = canvas.getContext('2d');
  var int1 =Math.random();		
 /* var int2=int1/100;
  var intwidth=19200*int2;
  var intheight=10800*int2;*/
   var int2=int1;
  var intwidth=19200*int2;
  var intheight=10800*int2;
  ctx.drawImage(image,0,0,intwidth,intheight);
 /*var canvas1 = document.getElementById('drawing1');
  var ctx1 = canvas1.getContext('2d');
 var myImageData = ctx.getImageData(0,0,100,100);
 ctx1.putImageData(myImageData, 100, 100);*/
}
