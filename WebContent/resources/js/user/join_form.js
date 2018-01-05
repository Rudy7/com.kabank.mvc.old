function init(){
	document.querySelector('#join_confirm_btn')
		.addEventListener("click",joinConfirm,false);
	document.querySelector('#check_dupl_btn')
		.addEventListener("click",checkDupl,false);
}
function checkDupl(){
	alert('중복체크 클릭');
	e.preventDefault();
}		
function joinConfirm(){
	document.querySelector('#join_form').submit();
	var joinJd = document.querySelector('')
}

window.addEventListener("load",init,false);
