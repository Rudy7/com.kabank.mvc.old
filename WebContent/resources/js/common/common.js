window.onload = execute;
function execute(){	
	document.querySelector('#go_home').onclick=goHome;
	document.querySelector('#go_out').onclick=goOut;
	document.querySelector('#join_confirm_btn').onclick=loginSuc;
	
}
function goHome(){
	location.href = "../burgerking/main.jsp";
}
function goOut(){
	location.href = "../index.jsp"
}
function loginSuc(){
	location.href = "../index.jsp"
}

