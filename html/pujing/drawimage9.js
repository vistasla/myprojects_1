// JavaScript Document
drawing=document.getElementById("drawing");
EventUtil.addHandler(drawing,"mousemove",function(event){
	
	event=EventUtil.getEvent(event);
	var x=event.clientX;
	var y=event.clienty;
	console.log(x+","+y);
})
