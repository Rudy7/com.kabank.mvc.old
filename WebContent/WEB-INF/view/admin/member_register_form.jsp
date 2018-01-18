<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  <div style="width:1000px; height:580px; border:1px solid grey; margin:0 auto;">
	<header>
		<h1 style="text-align:center">관리자 페이지 메인</h1> 
	</header>
		<aside >
			<table style="width:150px; height:500px; background:orange; float:left; border:1px solid grey;">
				<tr>
					<td>
						<h1 style="margin-bottom: 300px">회원관리</h1>
					</td>
				</tr>
			</table>
		</aside>
			<section style="width:600px; height:500px; border : 1px solid grey; margin:0 auto;">
				<form id="insert_member" action="${ctx}/user.do">  <!--id를 멤버_레지스터_폼 으로 줬다.   -->
				 <table style="width:600px; height:500px; border:1px solid grey; margin:0 auto;" >
			     		<tr>
			     			<td>
					    		<input id="index_search" type="text"  placeholder="ID"> 
					  		  	<button id="index_search2">검색
					   			</button>
			     			</td>
			     		</tr>
						<tr>
							<td>ID : <input name="id" type="text" />
							</td>
						</tr>	
						<tr>
							<td>이름 : <input name="name" type="text" />
							</td>
						</tr>
						<tr>
							<td>생년원일 : <input name="ssn" type="text" />
							</td>
						</tr>
						<tr>
							<td>전화번호 : <input name="phone" type="text" />
							</td>
						</tr>	
						<tr>
							<td>이메일 : <input name="email" type="text" />
							</td>
						</tr>
						<tr>
							<td>주소 : <input name="addr" type="text" />
							</td>
						</tr>
						<tr>
							<td>
								<input id="member_register_btn" type="button" value="전 송" style="width:100px;"/>										
							</td>
						</tr>
			 	</table>
		</form>
			</section>
  </div>
<script src="../../js/admin/member_register_form.js"> </script>
<%@ include file= "../common/footer.jsp" %>
</body>
</html>