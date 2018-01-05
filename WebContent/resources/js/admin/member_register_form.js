function init(){
	document.querySelector('#member_register_btn')
	.addEventListener("click",memberRegister,false);

}
function memberRegister(){
	/*location.href="member_register.jsp";*/   
	/*이줄과아랫줄차이점-전달하는값이 있고없고차이.1번은이동만,2번은폼이라데이타까지같이간다.1번이더빠르다*/ 
	document.querySelector('#insert_member').submit();
}

window.addEventListener("load",init,false);