function init() {
	/*document.querySelector("#create_table_btn").addEventListener("click",alertMessage,false);*/
	document.querySelector("#create_table_btn").addEventListener("click",memberMgmtLink,false);
	document.querySelector("#member_mgmt_link").addEventListener("click",memberMgmtLink,false);
}
function alertMessage(){
	alert("클릭");
}
function memberMgmtLink(){
	location.href = "member_list.jsp"   
}
window.addEventListener("load", init, false);


