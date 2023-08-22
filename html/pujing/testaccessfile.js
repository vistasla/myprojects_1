// JavaScript Document
function testaccessfile() {
 
   var inputelement = document.getElementById('test');     			
   var reader=new FileReader();    
   var result=reader.readAsDataURL(image);
   var image1=new image();
   image1.src=result;
   document.body.appendChild(image1);
 }
 

function draw() {

}
