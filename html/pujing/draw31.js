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
  /*var canvas = document.getElementById('drawing');    
  var ctx = canvas.getContext('2d');
  var image=document.createElement("img");
  image.src=reader.result;
  ctx.drawImage(image,0,0);*/
  }, false);

  if (file) {
    reader.readAsDataURL(file);
  }
}
function draw() {
 var file    = document.querySelector('input[type=file]').files[0];
  var reader  = new FileReader();
  reader.addEventListener("load", function () {

  var canvas = document.getElementById('drawing');  
  
  
  var ctx = canvas.getContext('2d');
  var image=document.createElement("img");
  image.src=reader.result;
  var width=image.width;
  var height=image.height;
  var x=(750-width)/2;
  var y=(750-height)/2;
 // ctx.drawImage(image,x,y,width/3, height/3);
 // ctx.drawImage(image,0,0,width/100, height/100);
   //ctx.drawImage(image,0,0,192,108 );
  //ctx.drawImage(image, 0, 0, 192, 108, 0, 0, 192, 108);
    ctx.drawImage(image, 0, 0);
  console.log(image.width+","+image.height);
  }, false);

  if (file) {
    reader.readAsDataURL(file);
  }  
 }
 
function copy() {
  var canvas = document.getElementById('drawing');  
  var canvas1 = document.getElementById('drawing1'); 
  var canvas2 = document.getElementById('drawing2'); 
  var ctx = canvas.getContext('2d');
  var ctx1 = canvas1.getContext('2d');
  var ctx2 = canvas2.getContext('2d');
  var myImageData = ctx.getImageData(100,100,200,200);
  ctx1.putImageData(myImageData, 0, 0);
  ctx2.putImageData(myImageData, 0, 0);
	}

