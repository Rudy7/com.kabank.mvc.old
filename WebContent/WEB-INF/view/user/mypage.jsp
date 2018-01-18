<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file= "../common/nav.jsp" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<div>
		<h1>마이페이지</h1>
			<article>
				<table id="memberInfo">
					<tr id="pict">
						<td rowspan="5" id="pi"><img id="pin" src="${ctx}/resources/img/profile.jpg"/></td>
						<td>ID</td>
						<td>${sessionScope.user.id}</td>
						<td>생년월일</td>
						<td>${sessionScope.user.ssn}</td>
					</tr>
					<tr>
						<td>PASS</td>
						<td>${sessionScope.user.pass}</td>
						<td>NO</td>
						<td>${sessionScope.user.phone}</td>
					</tr>
					<tr>
						<td>이름</td>
						<td>${sessionScope.user.name}</td>
						<td>이메일</td>
						<td>${sessionScope.user.email}</td>
					</tr>
					<tr>
						<td>성별</td>
						<td>남자</td>
						<td>주소</td>
						<td>${sessionScope.user.addr}</td>
					</tr>
						<tr>
						<td>ACCOUNT</td>
						<td colspan="3">${sessionScope.user.account.accountNum}</td>  <!-- user에는 어카운트넘버가 없다 -->
						
					</tr>
				</table> <br />
				  <form id="attend_form" action="result.jsp">
					<table id="frame" >
						<tr>
							<th>월</th>
							<th>화</th>
							<th>수</th>
							<th>목</th>
							<th>금</th>
						</tr>
					</table>
				 </form>	<br />
					<table id="pass_update_css" >	
						<tr>
							<td colspan="6">
								<input type="hidden" name="id" value="null" />
								<button id="leave">회원 탈퇴</button>
								<button id="pass_update" >비밀번호 변경</button>
								<input type="hidden" name="cmd" value="deleteMember" />
								<input type="hidden" name="dir" value="user" />
								<input type="hidden" name="page" value="login" />
							</td>
						</tr>
					</table>		
			</article>
	</div>
</body>
<script>
document.querySelector('#pass_update').addEventListener("click",
		function(){
		alert("비트캠프메인-비밀번호 변경페이지로 이동 직전");
		location.href="${ctx}/user.do?cmd=move&page=changePass";
		},false);	
document.querySelector('#leave').addEventListener("click",
		function(){
		alert("비트캠프메인 - 회원 탈퇴 클릭이벤트 발생");
		location.href="${ctx}/user.do?cmd=deleteMember&userid=${sessionScope.user.id}";
		},false);
</script>		
</html>