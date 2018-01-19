package com.kabank.mvc.daoImpl;

import com.kabank.mvc.dao.AdminDAO;
import com.kabank.mvc.enums.OracleEnum;
import java.sql.*;
public class AdminDAOImpl implements AdminDAO {

	public static AdminDAO getInstance() {
		return new AdminDAOImpl();
	}
	private AdminDAOImpl() {
		
	}


	@Override
	public void makeTable(String sql) {
		try {
			Class.forName(OracleEnum.ORACLE_DRIVER.value);
			Connection conn = DriverManager.getConnection(OracleEnum.ORACLE_CONNECTION_URL.value,
					  OracleEnum.ORACLE_USERNAME.value, 
					  OracleEnum.ORACLE_PASSWORD.value);
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			System.out.println("넘어온 sql :" +sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}