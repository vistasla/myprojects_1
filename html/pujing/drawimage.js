// JavaScript Document
function drawimage() {
	var drawing=document.getElementById("drawing");
	if(drawing.getContext){
		
		var context=drawing.getContext("2d");
		var image1=document.images[0];
		//context.drawImage(image1,10,10);
		context.drawImage(image1,19,10);
		//var imgURI=drawing.toDataURL("image/png");
		var imgURI=context.toDataURL("image/png");
		var image=document.createElement("img");
		image.src=imgURI;
		document.body.appendChild(image);
		
		
		}
}