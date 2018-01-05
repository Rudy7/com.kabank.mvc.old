package com.kabank.mvc.daoImpl;

import java.sql.*;
import java.util.*;
import com.kabank.mvc.constants.DBMS;
import com.kabank.mvc.dao.MemberDAO;
import com.kabank.mvc.domain.MemberBean;

public class MemberDAOImpl implements MemberDAO{

	@Override
	public List<MemberBean> work() {
		List<MemberBean> list = new ArrayList<>();
		try {
			Class.forName(DBMS.ORACLE_DRIVER);
			Connection conn = DriverManager.getConnection(DBMS.ORACLE_CONNECTION_URL, DBMS.ORACLE_USERNAME, DBMS.ORACLE_PASSWORD);
			Statement stmt = conn.createStatement();
			String sql = "SELECT id, pass, name, ssn, phone, email, profile, addr FROM Member";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				rs.getString("id");
				rs.getString("pass");
				rs.getString("name");
				rs.getString("ssn");
				rs.getString("phone");
				rs.getString("email");
				rs.getString("profile");
				rs.getString("addr");					
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
