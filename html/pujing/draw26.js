// JavaScript Document
function previewFile() {
  var preview = document.querySelector('img');
  var file    = document.querySelector('input[type=file]').files[0];
  var reader  = new FileReader();
  reader.addEventListener("load", function () {
  preview.src = reader.result;
  }, false);

  if (file) {
    reader.readAsDataURL(file);
  }
}
function draw() {
  var canvas = document.getElementById('drawing');  
  var canvas1 = document.getElementById('drawing1'); 
  var file=document.querySelector('input[type=file]').files[0];
  var ctx = canvas.getContext('2d');
  var ctx1 = canvas1.getContext('2d');
  var image=document.createElement("img");
  var reader1  = new FileReader();
  
  image.src=reader1.readAsDataURL(file);
  //image.src=reader1.result;
console.log(reader1.readAsDataURL(file));
  ctx.drawImage(image,0,0);

 /*var ImageData= ctx.getImageData(50, 50, 200, 200); 
  ctx1.putImageData(ImageData, 50, 50);   
  */
  //ctx.drawImage(image,0,0);
 
     
 
 }
 
 function draw1() {
	 var canvas1 = document.getElementById('drawing1'); 
  var image=document.images[0];
  
  var ctx1 = canvas1.getContext('2d');
  ctx1.clearRect(0, 0, 750, 750);
	 ctx1.drawImage(image,0,0,750,750);
}
function draw2() {
 
}

