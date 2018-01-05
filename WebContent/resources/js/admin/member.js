function init() {
	document.querySelector("#add_member_btn").addEventListener("click",addMember,false);
}
function addMember(){
	location.href="member_register_form.jsp";
}
function alertMessage(){
	alert("클릭");
}
window.addEventListener("load", init, false);



