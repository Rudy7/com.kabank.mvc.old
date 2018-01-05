function init(){
	var checkDuplBtn = document.querySelector('#check_dupl_btn');
	var joinConfirmBtn = document.querySelector('#join_confirm_btn');
	checkDuplBtn.addEventListener("click",checkDuplclick,false);
	joinConfirmBtn.addEventListener("click",joinConfirm,false);
	
}
function checkDuplclick(e){
	alert('중복체크 클릭');
	e.preventDefault();         /* 막아라 디폴트를 하지마라*/
}
function joinConfirm(e){
	var joinId = document.querySelector('#join_id').value;
	var joinPass = document.querySelector('#join_pass').value;
	alert('가입 확인 클릭'+joinId);
	sessionStorage.setItem('id',joinId);
	sessionStorage.setItem('pass',joinPass);

}
window.addEventListener("load",init,false);







