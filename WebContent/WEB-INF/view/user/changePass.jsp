<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file= "../common/header.jsp" %>		
<%@ include file= "../common/nav.jsp" %>
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
		<form id="changePass_form" action="${ctx}/user.do">
			<table>
				<tr>
					<td>
						<input id="now_pass"  type="text" value="${sessionScope.user.pass}" />현재 비밀번호 <br /> <br />
						<input id="newPass" name="newPass" value="" type="text" />수정할 비밀번호 <br /><br />
						<input id="update_pass_secend" type="text" />수정할 비밀번호 확인 <br /><br />
						<input type="hidden" name="cmd" value="change_pass" />
						<input type="hidden" name="dir" value="bitcamp" />	
						<input type="hidden" name="page" value="main" />								
					</td>
				</tr>
			</table>
		</form>
			<table>
				<tr>
					<td>	
						<button id="pass_update_login">확인</button> 										
						<button id="pass_update_cancel">취소</button> 	
					</td>
				</tr>
			</table>
	</div>
	<%@ include file= "../common/footer.jsp" %>
</body>
	<script>
/* document.querySelector('#pass_update_login').addEventListener("click",
		function(){
		alert("비밀번호가 변경되었습니다.");
		document.querySelector('#changePass_form').submit();
		},false); */
		
		
	</script>
</html>



