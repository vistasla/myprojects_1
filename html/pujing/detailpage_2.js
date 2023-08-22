// JavaScript Document
function loadcontent() {
	
detailpageurlsearch=document.location.search;
index_test=detailpageurlsearch.indexOf("&");
bookname=detailpageurlsearch.substring(10,index_test);
chapternumber=detailpageurlsearch.substring(index_test+15);

var xmlHttp=new XMLHttpRequest();
selectmembertypeurl="selectmembertype.php";
//readcontenturl = "readcontent.php"+"?"+"bookname="+bookname+"&"+"chapternumber="+chapternumber;
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
	 document.getElementById("h1").textContent=chapternumber;		  		 
	 document.getElementById("content").textContent=responseText;
}
	
	}
	
	}