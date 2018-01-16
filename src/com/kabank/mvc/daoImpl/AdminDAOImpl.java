package com.kabank.mvc.daoImpl;

import com.kabank.mvc.dao.AdminDAO;
import com.kabank.mvc.enums.OracleEnum;
import java.sql.*;
public class AdminDAOImpl implements AdminDAO {

	@Override
	public void makeTable(String sql) {
		// TODO Auto-generated method stub
		try {
			Class.forName(OracleEnum.ORACLE_DRIVER.value);
			Connection conn = DriverManager.getConnection(OracleEnum.ORACLE_CONNECTION_URL.value,
					  OracleEnum.ORACLE_USERNAME.value, 
					  OracleEnum.ORACLE_PASSWORD.value);
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			System.out.println("넘어온 sql :" +sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void kakaoCreateTable(String sql) {
		System.out.println("===============ADMIN-D: kakaoCreateTable IN===============");
			try {
				Class.forName(OracleEnum.ORACLE_DRIVER.value);
				Connection conn = DriverManager.getConnection(OracleEnum.ORACLE_CONNECTION_URL.value,
						OracleEnum.ORACLE_USERNAME.value,
						OracleEnum.ORACLE_PASSWORD.value);
				Statement stmt = conn.createStatement();
				stmt.executeQuery(sql);
				System.out.println("sql :" +sql);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("===============ADMIN-D: kakaoCreateTable OUT===============");
	}

	public static AdminDAO getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}