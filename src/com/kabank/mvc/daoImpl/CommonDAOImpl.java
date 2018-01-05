package com.kabank.mvc.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.kabank.mvc.constants.CommonSQL;
import com.kabank.mvc.constants.DBMS;
import com.kabank.mvc.dao.CommonDAO;

public class CommonDAOImpl implements CommonDAO{
	String count = "";
	CommonSQL com = new CommonSQL();
	@Override
	public String selectTableCount() {
		// TODO Auto-generated method stub
		
		try {
			Class.forName(DBMS.ORACLE_DRIVER);       //오자드오드
			Connection conn = DriverManager.getConnection(DBMS.ORACLE_CONNECTION_URL, DBMS.ORACLE_USERNAME, DBMS.ORACLE_PASSWORD);
			Statement stmt = conn.createStatement();	
			/*String sql = com.getCount("Member");*/   //scacft
			/*System.out.println("실행할 쿼리 :"+ sql);*/
			ResultSet rs = stmt.executeQuery(CommonSQL.getCount("Member"));
			while(rs.next()) {
				count = rs.getString("count");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}

