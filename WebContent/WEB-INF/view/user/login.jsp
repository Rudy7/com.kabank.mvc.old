<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>index</title>
<link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/img/favicon.ico" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/common.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/index.css" />

</head>
<body>
<div id="wrapper3">
		<header id="index_header">
			<a href="#">비트 캠프 프로젝트</a>
		</header>
		<section >
			<article>
		 <table id="index_table" >
			<tr >
			<td colspan="5">
			
				<form action="">
				<table>
						<tr>
	   						<td>
	   							<input id="id" name="id" type="text" placeholder="ID"> <!--id=자바스크립트는, name=호출  -->
						    </td>
						    <td rowspan="2">
						    	<button id="index_login_btn" >로그인</button>
							</td>
						</tr>
						<tr>
							<td>
								<input id="pass" name="pass" type="text"  placeholder="PASSWORD" />
							</td>
						</tr>	
				</table>
				</form>
				<table>
				<tr>
					<td>
						<a id="go_admin_link" href="#" >관리자 <br/>
						</a> 
						<a id="go_join_link" href="#" >회원가입  <br/>
						</a>
						<a id="go_jdbc_link" href="#" >JDBC TEST 
						</a>
					</td>
				</tr>
				</table>	
			</table> 
			</article>
	</section>
</div>
<%@ include file= "../common/footer.jsp" %>
<script>
document.querySelector('#go_join_link')
		.addEventListener("click",
		function (){
			location.href="${pageContext.request.contextPath}/user/join.do";
},false);

document.querySelector('#go_jdbc_link')
		.addEventListener("click",
		function(){
			location.href="${pageContext.request.contextPath}/common/jdbc_test.do";
},false);
document.querySelector('#index_login_btn')
		.addEventListener("click",
		function(){
			document.querySelector('#index_login_box').submit();
		},false);
document.querySelector('#go_admin_link').addEventListener("click",
		function(){
		location.href="${pageContext.request.contextPath}/admin/main.do";
}
		,false);
		
</script>
</body>
</html>
