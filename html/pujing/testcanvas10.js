// JavaScript Document
const fileSelect = document.getElementById("fileSelect"),
fileElem = document.getElementById("fileElem");

fileSelect.addEventListener("click", function (e) {
  if (fileElem) {
    fileElem.click();
  }
}, false);
function previewFile() {
//x1=null,y1=null,x2=null,y2=null,x3=null,y3=null,x4=null,y4=null,radian=null,startpostion_x=null,startpostion_y=null;
x1=null,y1=null,x2=null,y2=null,x3=null,y3=null,x4=null,y4=null,radian=null,x5=null,y5=null;

i=0;
//x4=0,y4=0;
//radian=null;
//startpostion_x=0,startpostion_y=0;
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
  width1=canvas.width;
  height1=canvas.height; 
  x5=(width1-width)/2;
  y5=(height1-height)/2;

  //ctx.drawImage(image,(width1-width)/2,(height1-height)/2,width,height);
  ctx.drawImage(image,x5,y5,width,height);  
  }, false);

  if (file) {
    reader.readAsDataURL(file);
  }
}
function draw() {
 ctx.clearRect(-x4,-y4,width1,height1);
 }
 
function copy() {
 
  var canvas1 = document.getElementById('drawing1'); 
  var canvas2 = document.getElementById('drawing2'); 
 
  var ctx1 = canvas1.getContext('2d');
  var ctx2 = canvas2.getContext('2d');
  canvas1.width=width1/4;
  canvas1.height=height1/4;
  canvas2.width=width1/8;
  canvas2.height=height1/8;
  
  image1=document.createElement("img");
  image1.src=canvas.toDataURL();
  document.body.appendChild(image1);
  ctx1.drawImage(image1, 0, 0);
  ctx2.drawImage(image1, 0, 0);
 // ctx1.drawImage(image1, 0, 0,400,400,0,0,100,100);
  //ctx2.drawImage(image1, 0, 0,400,400,0,0,50,50);
  //var myImageData = ctx.getImageData(0,0,canvas.width,canvas.height);
  //ctx1.putImageData(myImageData, 0, 0);
  //ctx2.putImageData(myImageData, 0, 0);
   
	}
	
function rotateleft() {
   console.log("rotateleft");
   ctx.clearRect(-x4,-y4,width1,height1);
   i++;
   ctx.translate(-x4, -y4);
/*if(i==1){
	width2=width1/2;
	height2=height1/2;
	ctx.translate(width2,height2);
	}
else{
	
		}*/
		
	width2=width1/2;
	height2=height1/2;
	ctx.translate(width2,height2);
    ctx.rotate(Math.PI*2/4);
    radian=(Math.PI*2/4)*i;
 
    //ctx.drawImage(image,(width1-width)/2-width2+x4,(height1-height)/2-height2+y4,width,height); 
	ctx.drawImage(image,x5-width2+x4,y5-height2+y4,width,height); 

  /*if(i>1){
	 ctx.rotate(-radian);
	 }*/
	 
   ctx.rotate(-radian);
   ctx.translate(-width2+x4,-height2+y4);
 }

function zoomin() {
 
 
 }
 function zoomout() {
		  
  ctx.scale(0.3, 0.3);
 console.log(width1+","+height1);
   
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
 /*if(i>1){
	 ctx.rotate(-radian);
	 }*/ 
 x2=event.clientX;
 y2=event.clientY;
 x3=x2-x1;
 y3=y2-y1; 
 ctx.clearRect(-x4,-y4,width1,height1);
 //ctx.drawImage(image,(width1-width)/2+x3,(height1-height)/2+y3,width,height);	
 ctx.drawImage(image,x5+x3,y5+y3,width,height);													
 }

 function mouseup() {
 console.log("mouseup");
 divelement.onmousemove=null;  
 ctx.translate(x3,y3 );
 x4=x4+x3;
 y4=y4+y3;
 }