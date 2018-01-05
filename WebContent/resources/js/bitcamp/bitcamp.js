function init(){
	document.querySelector('#attend_result')
		.addEventListener("click",attendResult,false);
}

function attendResult(){
	document.querySelector('#attend_form').submit;
}

window.addEventListener("load",init,false);