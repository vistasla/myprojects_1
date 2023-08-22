// JavaScript Document
const fileSelect = document.getElementById("fileSelect"),
fileElem = document.getElementById("fileElem");

fileSelect.addEventListener("click", function (e) {
  if (fileElem) {
    fileElem.click();
  }
}, false);
function previewFile() {
	x1=null,y1=null,x2=null,y2=null,x3=null,y3=null;
//x4=null,y4=null;
x4=0,y4=0;
i=0;
x5=0,y5=0;
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

  canvas.width=400;
  canvas.height=400;
  //ctx.drawImage(image,(400-width)/2,(400-height)/2);
  ctx.drawImage(image,(400-width)/2,(400-height)/2,width,height);
        x5=(400-width)/2;
		y5=(400-height)/2;     								
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
  //ctx1.putImageData(myImageData, 0, 0);
  //ctx2.putImageData(myImageData, 0, 0);
   
	}
	
function rotateleft() {
	
   ctx.clearRect(-x4,-y4,400,400);
  i++;
if(i==1){
	ctx.translate(200, 200);
	}
else{
	
		}
 ctx.translate(-x3, -y3);
 ctx.rotate(-Math.PI*2/2);

 //ctx.drawImage(image,(400-width)/2+x3,(400-height)/2+y3,width,height);
 
 ctx.drawImage(image,x5-200,y5-200,width,height);
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
}
 function mousemove() {
	
 console.log("mousemove");
 x2=event.clientX;
 y2=event.clientY;
 x3=x2-x1;
 y3=y2-y1;
 	
 ctx.clearRect(-x4,-y4,400,400);
// ctx.drawImage(image,((400-width)/2)+x3,((400-height)/2)+y3);
 ctx.drawImage(image,(400-width)/2+x3,(400-height)/2+y3,width,height);
 x5=(400-width)/2+x3;
 y5=(400-height)/2+y3;
 /*x3=0;
 y3=0; */   
/* x1=x2;
 y1=y2; */   								
 }

 function mouseup() {
 console.log("mouseup");
 divelement.onmousemove=null;  
 ctx.translate(x3,y3 );
 x4=x4+x3;
 y4=y4+y3;
 }