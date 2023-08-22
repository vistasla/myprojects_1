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
//chapternumber=chapternumber+1;	
//document.getElementById("h1").textContent=chapternumber+1;	
	 var title="bookname:"+bookname+"&chapter:"+chapternumber;
	 document.title=title;
	 document.getElementById("h1").textContent=title;		  		 
	 document.getElementById("content").textContent=responseText;
}
	
	}
	
	}
	function loadnextpage() {
	chapternumber=Number(chapternumber)+1;	
	//alert(chapternumber);
	//alert(typeof(chapternumber));
	documenthref=document.location.href;	
	index_test_1=documenthref.lastIndexOf("=");
	substring_1=documenthref.substring(0,index_test_1+1);
	document.location.href=substring_1+chapternumber;
	/*var xmlHttp=new XMLHttpRequest();
	xmlHttp.onreadystatechange=stateChanged;			
xmlHttp.open("GET",readcontenturl,true);
xmlHttp.send();
function stateChanged()
{
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
 {
var responseText= xmlHttp.responseText ;
//chapternumber=chapternumber+1;	
//document.getElementById("h1").textContent=chapternumber+1;	
	 var title="bookname:"+bookname+"chapter:"+chapternumber;
	 document.title=title;
	 document.getElementById("h1").textContent=title;		  		 
	 document.getElementById("content").textContent=responseText;
}
	
	}*/
	
	}
	function loadpreviouspage() {
	chapternumber=Number(chapternumber)-1;	
	documenthref=document.location.href;	
	index_test_1=documenthref.lastIndexOf("=");
	substring_1=documenthref.substring(0,index_test_1+1);
	document.location.href=substring_1+chapternumber;
	}