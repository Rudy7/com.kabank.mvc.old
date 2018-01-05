<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file= "../common/head.jsp" %>
<!doctype html>
<html lang="en">
<%@ include file= "../common/head.jsp" %>
<link rel="stylesheet" href="../../css/admin.css" />
<body>	
  <div id="admin_div">
	<header>
		<h1 id="admin_title">관리자 페이지 메인</h1> 
	</header>
		<aside id="admin_aside" >
						<button id="member_mgmt_link">회원관리
						</button>
		</aside>
			<section id="admin_section"><table id="admin_table" >
						<tr>
							<td>
							<button id="create_table_btn">테이블생성</button>
							</td>
							<td>준비중</td>
							<td>준비중</td>
						</tr>
						<tr>
							<td>준비중</td>
							<td>준비중</td>
							<td> 테이블 생성 <br />
								<form id="go_create_form" action="${pageContext.request.contextPath}/admin/create_table.do">        <!--인풋이 있으면 폽으로 감싸야한다@@@@  아이디 액션 줘야한다-->
									<select name="" id="">
										<option>               <!-- 회원테이블 value : member   멤버쿼리문으로-->
										</option>              <!-- 출석테이블 value : attend   어텐드면 어텐드쿼리문으로-->
									</select> 
									<button id="create_btn">생성</button>
								</form>
							</td>
						</tr>
					</table>
					
			</section>
  </div>
  <script >
document.querySelector('#create_btn').addEventListener("click",
		function(){
		document.querySelector('#go_create_form').submit();
}
		,false);
 
  	
  </script>
</body>
<%@ include file= "../common/footer.jsp" %>
</html>