<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="wrapper3">
		<header id="index_header">
			<a href="#">프로젝트</a>
		</header>
		<section >
			<article>
		 <table id="index_table" >
			<tr >
			<td colspan="5">
				<form id="index_login_box" action="${ctx}/user.do">
					<table>
							<tr>
		   						<td>
		   							<input id="id" name="id" type="text" value="kim" placeholder="ID"> <!--id=자바스크립트에서사용(.js.jsp), name=자바에서사용(.java)-->
							    </td>
							    <td rowspan="2">
							    	<button id="index_login_btn"  >로그인</button>   	
								</td>
							</tr>
							<tr>
								<td>
									<input id="pass" name="pass" type="text" value="1" placeholder="PASSWORD" />
									<input type="hidden" name="cmd" value="login" />
									<!-- <input type="hidden" name="dir" value="bitcamp" /> -->
									<input type="hidden" name="page" value="mypage" />
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
			alert("로그인창에서 회원가입으로 가기직전");
			location.href="${ctx}/user.do?cmd=move&page=join";
		},false);

document.querySelector('#go_jdbc_link')
		.addEventListener("click",
		function(){
			location.href="${ctx}/common/jdbc_test.do";
		},false);

document.querySelector('#index_login_btn')
		.addEventListener("click",
		function(){
			alert("============로그인 클릭이벤트 발생============");
			document.querySelector('#index_login_box').submit();
		},false);
		
document.querySelector('#go_admin_link').addEventListener("click",
		function(){
		location.href="${ctx}/admin/main.do";    /* /admin/main.do */
		},false); 		
</script>
</body>
</html>
