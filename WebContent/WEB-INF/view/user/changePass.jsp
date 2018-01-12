<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<div>
		<header>
		
		</header>
		<form id="changePass_form" action="" >
			<table>
				<tr>
					<td>
						<input id="now_pass" type="text" />현재 비밀번호 <br /> <br />
						<input id="update_pass1" type="text" />수정할 비밀번호 <br /><br />
						<input id="update_pass2" type="text" />수정할 비밀번호 확인 <br /><br />
						<button id="pass_update_login">확인</button> 										
						<button id="pass_update_cancel">취소</button> 										
					</td>
				</tr>
			</table>
		</form>
			<table>
				<tr>
					<td>	
					</td>
				</tr>
			</table>
	</div>
	<%@ include file= "../common/footer.jsp" %>
</body>
	<script>
document.querySelector('#pass_update_login').addEventListener("click",
		function(){
		alert("비밀번호가 변경되었습니다.");
		location.href="${ctx}/user.do?cmd=move&page=login";
		},false);
	</script>
</html>



