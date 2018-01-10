<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "java.util.*" %>
  <div style="width:1000px; height:600px; border:1px solid grey; margin:0 auto;">
	<header>
		<h1 style="text-align:center">관리자 회원 리스트 검색</h1> 
	</header>
		<aside>
			<table style="width:150px; height:519px; background:orange; float:left; border:1px solid grey;">
				<tr>
					<td>
						<h1 style="margin-bottom: 300px">회원관리</h1>
					</td>
				</tr>
			</table>
		</aside>
			<section id="admin_section" style=" height: 517px; border : 1px solid grey">
				 <table id="admin_table" >
				 	<tr>
				 		<td>
			    		<select name="name" id="select_id">
			  		   	 	<option value="ID">ID</option>
			 	    		<option value="성별">성별</option>
			 			</select>
					   		 <input id="index_search" type="text"  placeholder="ID"/> 
					    	 <button id="index_search2">검색
					    	</button>
			     		</td>
			     	</tr>
			     		<tr>
			     			<td>
			     			</td>
			     		</tr>
			     		
			     </table>		 
					<table style="width:600px; height:300px; border:1px solid grey; margin:50px 100px 100px 300px;" >
						<tr>
							<th>NO</th>
							<th>ID</th>
							<th>이름</th>
							<th>생년원일</th>
							<th>성별</th>
							<th>전화번호</th>
							<th>이메일</th>
							<th>주소</th>
						</tr>
					
						
							
						
					</table>
						<button id = "add_member_btn" style="margin-left:700px;   width:50px; height:30px;"> 추가
						</button>			
			</section>
					
  </div>
  <script src="../../js/admin/member_list.js"></script>
</body>
</html>