// JavaScript Document
function loadcontent() {
	
detailpageurlsearch=document.location.search;
index_test=detailpageurlsearch.indexOf("&");
bookname=detailpageurlsearch.substring(10,index_test);
chapternumber=detailpageurlsearch.substring(index_test+15);

var xmlHttp=new XMLHttpRequest();
selectmembertypeurl="selectmembertype.php";
readcontenturl = "readcontent.php"+detailpageurlsearch;
xmlHttp.onreadystatechange=stateChanged
xmlHttp.open("GET",selectmembertypeurl,true);
xmlHttp.send();

	function stateChanged()
{
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
 {
var responseText= xmlHttp.responseText ;

 if(responseText==1){
	 loadcontent_1();
 }

else{
	
	if(true){
	

}
else{
	
	
	}
	
	
	}
}
}
}

function loadcontent_1() {
	
	var xmlHttp=new XMLHttpRequest();
	xmlHttp.onreadystatechange=stateChanged;			
xmlHttp.open("GET",readcontenturl,true);
xmlHttp.send();
function stateChanged()
{
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
 {
var responseText= xmlHttp.responseText ;

	 var title="bookname:"+bookname+"&chapter:"+chapternumber;
	 document.title=title;
	 document.getElementById("h1").textContent=title;		  		 
	 document.getElementById("content").textContent=responseText;
}
	
	}
	
	}
	function loadnextpage() {
		selectbookinfo_chapterurl = "selectbookinfo_chapter.php"+"?"+"bookname="+bookname;
		var xmlHttp=new XMLHttpRequest();
	xmlHttp.onreadystatechange=stateChanged;			
xmlHttp.open("GET",selectbookinfo_chapterurl,true);
xmlHttp.send();
function stateChanged()
{
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
 {
 chaptercount= (Number)(xmlHttp.responseText) ;
//alert(typeof());
//alert();
if(chapternumber<chaptercount){
	
chapternumber=Number(chapternumber)+1;		
	documenthref=document.location.href;	
	index_test_1=documenthref.lastIndexOf("=");
	substring_1=documenthref.substring(0,index_test_1+1);
	document.location.href=substring_1+chapternumber;
}
else{
	alert("last page");
	
	}
	
}
	
	}
		
		
	
		
	}
	function loadpreviouspage() {
		if(chapternumber>0){
	chapternumber=Number(chapternumber)-1;	
	documenthref=document.location.href;	
	index_test_1=documenthref.lastIndexOf("=");
	substring_1=documenthref.substring(0,index_test_1+1);
	document.location.href=substring_1+chapternumber;

}
else{
	alert("first page");
	
	}
	
	}