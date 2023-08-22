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
   
   ctx.globalAlpha = 0.1; 
  image=document.createElement("img");
  image.src=reader.result;
    
   width=image.width;
   height=image.height; 

  canvas.width=width/5;
  canvas.height=height/5;
  width1=canvas.width;
  height1=canvas.height; 
  
  ctx.drawImage(image,0,0,width1,height1);
       							
  }, false);

  if (file) {
    reader.readAsDataURL(file);
  }
}

 
function draw() {
 
 
  
  image1=document.createElement("img");
  image1.src=canvas.toDataURL();
  document.body.appendChild(image1);
  
 // ctx1.drawImage(image1, 0, 0,400,400,0,0,100,100);
  //ctx2.drawImage(image1, 0, 0,400,400,0,0,50,50);
  //var myImageData = ctx.getImageData(0,0,canvas.width,canvas.height);
  //ctx1.putImageData(myImageData, 0, 0);
  //ctx2.putImageData(myImageData, 0, 0);
   
	}
	
