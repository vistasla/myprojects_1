// JavaScript Document
function loaddetailpage() {
event.target.style.background="red";
bookname=document.getElementById("bookname").textContent;
chapternumber=event.target.textContent.substring(7);
detailpageurl = "detailpage.php"+"?"+"bookname="+bookname+"&"+"chapternumber="+chapternumber;
window.open(detailpageurl, "_blank");
}
