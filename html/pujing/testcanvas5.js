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
  
          								
  }, false);

  if (file) {
    reader.readAsDataURL(file);
  }
}
function translate() {
	 
 ctx.translate(200,200 );
    
 }
 
function draw() {
	 console.log("draw");
 ctx.drawImage(image,(400-width)/2,(400-height)/2);
 
    
 }
 

function clear1() {
	 console.log("clear1");
 ctx.clearRect(0,0,400,400);

 }
 function clear2() {
	 console.log("clear2");
 //ctx.clearRect(-300,-200,400+300,400+200);
  ctx.clearRect(-200,-200,400,400);
    
 }
 
