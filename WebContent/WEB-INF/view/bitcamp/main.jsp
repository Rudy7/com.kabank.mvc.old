<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file= "../common/header.jsp" %>		
<%@ include file= "../common/nav.jsp" %>
	<section>
		<article>
			<h1>비트 캠프 메인</h1>
			<table id="memberInfo">
				<tr id="pict">
					<td rowspan="4" id="pi"><img id="pin" src="${pageContext.request.contextPath}/resources/img/profile.jpg"/></td>
					<td>ID</td>
					<td>${sessionScope.user.id} </td>
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
					<td>여자</td>
					<td>주소</td>
					<td>${sessionScope.user.addr}</td>
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
					<tr>	
						<td>1일
							<select name="name"  >
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td>2일
							<select name="name">
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td>3일
							<select name="name" >
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td>4일
							<select name="name" >
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td>5일
							<select name="name" >
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>
							결 과<input id="result_view1" type="text" />
						</td>
						<td>
							결 과<input id="result_view2" type="text" />
						</td>
						<td>
							결 과<input id="result_view3" type="text" />
						</td>
						<td>
							결 과<input id="result_view4" type="text" />
						</td>
						<td>
							결 과<input id="result_view5" type="text" /> 
						</td>
					</tr>
					<tr>
						<td colspan="6">
							<input type="hidden" name="id" value="null" />
							<button style="width:100px; height:50px;" id="attend_result">확인</button>
						</td>
					</tr>
				</table>		
		   </form>
		</article>
	</section>		
<%@ include file= "../common/footer.jsp" %>	 <!-- 푸터는 보여지는 곳이라 바디 안에 있어야 한다. -->
</body>
	<!-- <script src="../../js/bitcamp/bitcamp.js"></script> -->
</html>






