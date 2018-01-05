<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<%@ include file= "../common/head.jsp" %>	<!-- 헤드는 바디 밖에 둬야한다.  -->

<body>
<%@ include file= "../common/header.jsp" %>		
<%@ include file= "../common/nav.jsp" %>
	<section>
		<article>
			<h1>비트 캠프 메인</h1>
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
						<td>8일
							<select name="name" >
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td>9일
							<select name="name" >
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td>10일
							<select name="name" >
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td>11일
							<select name="name" >
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td>12일
							<select name="name" >
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>15일
							<select name="name">
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td>16일
							<select name="name">
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td>17일
							<select name="name" >
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td>18일
							<select name="name" >
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td>19일
							<select name="name" >
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>22일
							<select name="name">
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td >23일
							<select name="name" >
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td >24일
							<select name="name">
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td >25일
							<select name="name" >
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td >26일
							<select name="name" >
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>29일
							<select name="name" >
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td>30일
							<select name="name">
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						</td>
						<td>31일
							<select name="name" >
								<option value="결석">결석</option>
								<option value="지각">지각</option>
								<option value="조퇴">조퇴</option>
								<option value="출석">출석</option>
							</select>
						<td>
						</td>
						<td>
						</td>
					</tr>
					<tr>
						<td>
							<input id="result_view1" type="text" />
						</td>
						<td>
							<input id="result_view2" type="text" />
						</td>
						<td>
							<input id="result_view3" type="text" />
						</td>
						<td>
							<input id="result_view4" type="text" />
						</td>
						<td>
							<input id="result_view5" type="text" />
						</td>
					</tr>
					<tr>
						<td colspan="6">
							<input type="hidden" name="id" value="null" />
							<button style="width:200; height:200;" id="attend_result">확인</button>
						</td>
					</tr>
				</table>		
		   </form>
		</article>
	</section>		
<%@ include file= "../common/footer.jsp" %>	 <!-- 푸터는 보여지는 곳이라 바디 안에 있어야 한다. -->
</body>
	<script src="../../js/bitcamp/bitcamp.js"></script>
</html>






