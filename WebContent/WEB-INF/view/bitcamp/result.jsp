<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import = "java.util.*" %>
<%
System.out.print("================찍고 옴==============");
Connection conn = null;
Statement stmt = null;
String sql = "";
ResultSet rs = null;

try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bitcamp","bitcamp");
	stmt = conn.createStatement();
	sql = "SELECT * FROM tab";
	 rs = stmt.executeQuery(sql);
	List<String> list = new ArrayList<>();
	while(rs.next()){
		String temp = rs.getString("TNAME");
		list.add(temp);
	}
	boolean exist = false;
	for(String s: list){
		if(s.equalsIgnoreCase("attend")){
			exist = true;
			break;
		}
	} 
	if(!exist){
		stmt.executeUpdate(
			"CREATE TABLE Attend("
			+" id VARCHAR2(20) PRIMARY KEY,"
			+" week VARCHAR2(10),"
			+" status VARCHAR2(10)"
				
		    +")");
	}
	/* else{
		rs = stmt.executeQuery(
				"SELECT id,week,status " + " FROM Member");
		while(rs.next()){
			MemberBean m = new MemberBean();
			String id = rs.getString("id");
			String week = rs.getString("week");
			String status = rs.getString("status");
	
			m.setId(id);
			  m.setWeek(week);
			m.setStatus(status); 
			
			result.add(m);
		} */
	/* } */
}catch(Exception e)
	{e.printStackTrace();
}



System.out.print("=======왔다 감=====");

pageContext.forward("main.jsp");
%>

















