<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="wrapper">
	<section>
		<article>
			<header id="join_second_header">
					<hgroup>
						<h1>회원 가입</h1>		
					</hgroup>
			</header>
		<form id="join_form" action="${pageContext.request.contextPath}/user/signup.do"> 
			<table style="margin-left: 250px" id= "member_table">
				<tr>
					<td>
						* 필수정보 입력란
					</td>
				</tr>
				<tr>
					<td>
						아이디*    <input id="id" name="id" type="text"  value="" placeholder="id" />
								   <button id="check_dupl_btn" name="check_cupl_btn">중복확인</button>
					</td>
				</tr>
				<tr>
					<td>
						비밀번호 숫자4자리*    <input id="pass" name="pass" pattern="[0-9]{4}" type="text" value=""  placeholder="pass" />
					</td>
				</tr>
				<tr>
					<td>
						이름*    <input  id="name" name="name" value="" type="text" placeholder="name" />
					</td>
				</tr>
				<tr>
					<td>
						주민번호*   <input pattern="[0-9]{13}" id="ssn" name="ssn" type="text" value="" placeholder="ssn" />
									 <!-- <input pattern="[0-9]{6}" type="text" name="name" value=""  placeholder="ssn1" /> -
									 <input pattern="[0-9]{7}" type="text" name="name" value=""  placeholder="ssn2" /> -->
					</td>
				</tr>
				<tr>
					<td>
						핸드폰번호 010-  <input pattern="[0-9]{8}" id="phone" name="phone" type="text" value="" placeholder="phone" />
										 <!--  <input pattern="[0-9]{4}" type="tel" name="name" value=""  placeholder="phone"/>-
						  				  <input pattern="[0-9]{4}" type="tel" name="name" value=""  placeholder="phone"/> -->
					</td>
				</tr>
				<tr>
					<td>
						이메일*    <input id="email" name="email" type="email"  value=""  placeholder="email" />
					</td>	
				</tr>
				<tr>
					<td>
						프로필    <input id="profile" name="profile" value="" type="text" placeholder="profile"/>
					</td>	
				</tr>
				<tr>
					<td>
						집주소    <input id="addr" name="addr" value="" type="text" placeholder="addr"/>
								
					</td>
				</tr>	
				<tr>
					<td>
						날짜    <input id="date" name="date" value="" type="date" placeholder="date"/> 
									
					</td>
				</tr>	
				<tr>
					<td>
 						<input id="join_confirm_btn" type="button" value="확인" style="width:100px;"   />
 						<input id="" type="button" value="취소" style="width:100px;"   />
					</td>
				</tr>
			</table> 
	 </form > 
		</article>
	</section>
		<aside>
		</aside>
</div>
<%@ include file= "../common/footer.jsp" %>	 <!-- 푸터는 보여지는 곳이라 바디 안에 있어야 한다. -->
</body>
<script>
document.querySelector('#join_confirm_btn').addEventListener("click",joinConfirm,false);
document.querySelcctor('#check_dupl_btn').addEventListener("click",checkDupl,false);
function joinConfirm(){
	alert("================멤버 컨트롤러로 출발===============");
	var form = document.querySelector('#join_form');
	form.submit();} 
function checkDupl(){
	location.href="${pageContext.request.contextPath}/";}
</script>	
</html>
