// JavaScript Document
function draw() {
  var canvas = document.getElementById('drawing');
  var canvas1 = document.getElementById('drawing1');
  var image=document.images[0];
  var ctx = canvas.getContext('2d');
var ctx1 = canvas1.getContext('2d');
  // Draw slice
  ctx.drawImage(image,
                0,0,100,100,100,100,100,100);

  // Draw frame
 // ctx.drawImage(image,0,0);
 var myImageData = ctx.getImageData(100,100,100,100);
 ctx1.putImageData(myImageData, 100, 100);
}
