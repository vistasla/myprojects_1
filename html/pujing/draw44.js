// JavaScript Document
const fileSelect = document.getElementById("fileSelect"),
fileElem = document.getElementById("fileElem");

fileSelect.addEventListener("click", function (e) {
  if (fileElem) {
    fileElem.click();
  }
}, false);
function previewFile() {
  var preview = document.querySelector('img');
  var file    = document.querySelector('input[type=file]').files[0];
  var reader  = new FileReader();
  reader.addEventListener("load", function () {
  preview.src = reader.result;
  var canvas = document.getElementById('drawing');    
  var ctx = canvas.getContext('2d');
  var image=document.createElement("img");
  image.src=reader.result;
    
  var width=image.width;
  var height=image.height; 
 /*canvas.width=width;
  canvas.height=height;*/
  canvas.width=400;
  canvas.height=400;
  ctx.drawImage(image,(400-width)/2,(400-height)/2);
  
          // console.log(canvas.width+","+canvas.clientWidth);      								
  }, false);

  if (file) {
    reader.readAsDataURL(file);
  }
}
function draw() {
 
 
 }
 
function copy() {
  var canvas = document.getElementById('drawing');  
  var canvas1 = document.getElementById('drawing1'); 
  var canvas2 = document.getElementById('drawing2'); 
  var ctx = canvas.getContext('2d');
  var ctx1 = canvas1.getContext('2d');
  var ctx2 = canvas2.getContext('2d');
  canvas1.width=canvas.width/4;
  canvas1.height=canvas.height/4;
  canvas2.width=canvas.width/8;
  canvas2.height=canvas.height/8;
  
  var image1=document.createElement("img");
  image1.src=canvas.toDataURL();
  document.body.appendChild(image1);

  ctx1.drawImage(image1, 0, 0,400,400,0,0,100,100);
  ctx2.drawImage(image1, 0, 0,400,400,0,0,50,50);
  //var myImageData = ctx.getImageData(0,0,400,400);
  //var myImageData = ctx.getImageData(0,0,canvas.width,canvas.height);
  //ctx1.putImageData.,(myImageData, 0, 0);
  //ctx1.putImageData(myImageData, 0, 0, 0, 0, 100, 100);
  //ctx2.putImageData(myImageData, 0, 0);
   
	}
	
function rotateleft() {
	 var canvas = document.getElementById('drawing'); 
	   var ctx = canvas.getContext('2d');
 
	 ctx.translate(2000, 2000);
 //ctx.rotate(Math.PI);
 
 }

function zoomin() {
 
 
 }
 function zoomout() {
	
	 
  var canvas = document.getElementById('drawing');    
  var ctx = canvas.getContext('2d');
  ctx.scale(0.3, 0.3);
 console.log(canvas.width+","+canvas.height);
  
 
 }
 function rotateright() {
 
 
 }