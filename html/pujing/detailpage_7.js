// JavaScript Document
//begin		
function xMLHttpRequest(methodtype,actionurl){
var responseText;
var xmlHttp=new XMLHttpRequest();
xmlHttp.onreadystatechange=stateChanged
//xmlHttp.open(methodtype,actionurl,true);
xmlHttp.open(methodtype,actionurl,false);
xmlHttp.send();

	function stateChanged()
{
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
 {
 responseText= xmlHttp.responseText ;
// alert(responseText);
// return responseText;
 //alert(responseText);
// alert("hello world_1");
 }}
 // alert("hello world_2");
 return responseText;
 }
//end

 //begin		
function xMLHttpRequest_1(methodtype,actionurl){

 return methodtype;

 }
 
//end

//begin	
function loadcontent() {	
detailpageurlsearch=document.location.search;
index_test=detailpageurlsearch.indexOf("&");
bookname=detailpageurlsearch.substring(10,index_test);
chapternumber=detailpageurlsearch.substring(index_test+15);

title="bookname:"+bookname+"&chapter:"+chapternumber;
document.title=title;
document.getElementById("h1").textContent=title;		  		 
	 
	 
selectbookinfo_startchapterurl="selectbookinfo_startchapter.php"+"?"+"bookname="+bookname;
startchapter= xMLHttpRequest("GET",selectbookinfo_startchapterurl);
//alert(xMLHttpRequest("GET",selectbookinfo_startchapterurl));

//alert(startchapter);
//alert(typeof(startchapter));
 if((Number)(chapternumber)<(Number)(startchapter)){
	 loadcontent_1();
 }

else{
	
	selectmembertypeurl="selectmembertype.php";
	alert("membertype failed");
	/*if(true){
	

}
else{
	
	
	}*/
}
}
//end

//begin	
function loadcontent_1() {
readcontenturl = "readcontent.php"+detailpageurlsearch;	
contenttext= xMLHttpRequest("GET",readcontenturl); 
/*var title="bookname:"+bookname+"&chapter:"+chapternumber;
	 document.title=title;
	 document.getElementById("h1").textContent=title;	*/	  		 
	 document.getElementById("content").textContent=contenttext;
	}
//end

 
//begin	
 
	function loadnextpage() {
		selectbookinfo_chapterurl = "selectbookinfo_chapter.php"+"?"+"bookname="+bookname;
		chaptercount= (Number)(xMLHttpRequest("GET",selectbookinfo_chapterurl)) ;

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
//end	

//begin	
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
//end