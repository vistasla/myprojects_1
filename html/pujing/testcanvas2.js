// JavaScript Document
const fileSelect = document.getElementById("fileSelect"),
fileElem = document.getElementById("fileElem");
x1=null,y1=null,x2=null,y2=null,x3=null,y3=null;
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
   canvas = document.getElementById('drawing');    
   ctx = canvas.getContext('2d');
  image=document.createElement("img");
  image.src=reader.result;
    
   width=image.width;
   height=image.height; 
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
 
  var canvas1 = document.getElementById('drawing1'); 
  var canvas2 = document.getElementById('drawing2'); 
 
  var ctx1 = canvas1.getContext('2d');
  var ctx2 = canvas2.getContext('2d');
  canvas1.width=canvas.width/4;
  canvas1.height=canvas.height/4;
  canvas2.width=canvas.width/8;
  canvas2.height=canvas.height/8;
  
  image1=document.createElement("img");
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
	
 
 }

function zoomin() {
 
 
 }
 function zoomout() {
	
	 
 
  ctx.scale(0.3, 0.3);
 console.log(canvas.width+","+canvas.height);
  
 
 }
 function rotateright() {
 
 
 }
 function mousedown() {
 console.log("mousedown");
 x1=event.clientX;
 y1=event.clientY;
 divelement=document.getElementById('test2'); 
 divelement.onmousemove=mousemove;
// divelement.addEventListener("mousemove",mousemove());
 /*divelement.addEventListener("mousemove",function mousemove() {
 console.log("mousemove");
 x2=event.clientX;
 y2=event.clientY;
 x3=x2-x1;
 y3=y2-y1;
  ctx.drawImage(image,((400-width)/2)+x3,((400-height)/2)+y3);
   console.log("mousemove1");            								
 });
*/ }
 function mousemove() {
 console.log("mousemove");
 x2=event.clientX;
 y2=event.clientY;
 x3=x2-x1;
 y3=y2-y1;
  ctx.drawImage(image,((400-width)/2)+x3,((400-height)/2)+y3);
   console.log("mousemove1");            								
 }

  function mouseup() {
 console.log("mouseup");
 
 //divelement.removeEventListener("mousemove",mousemove());
 divelement.onmousemove=null;
 x2=event.clientX;
 y2=event.clientY;
 x3=x2-x1;
 y3=y2-y1;
 x1=x3;
 y1=y3;    
 ctx.drawImage(image,((400-width)/2)+x3,((400-height)/2)+y3); 
 }