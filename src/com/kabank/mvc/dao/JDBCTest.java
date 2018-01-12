package com.kabank.mvc.dao;

import java.sql.*;

import com.kabank.mvc.enums.DMLEnum;
import com.kabank.mvc.enums.OracleEnum;

public class JDBCTest {
	public static void main(String[] args) {
		try {
			Class.forName(OracleEnum.ORACLE_DRIVER.value);
			Connection conn = DriverManager.getConnection(OracleEnum.ORACLE_CONNECTION_URL.value,
														  OracleEnum.ORACLE_USERNAME.value, 
														  OracleEnum.ORACLE_PASSWORD.value);
			Statement stmt = conn.createStatement();
			String sql = DMLEnum.COUNT.toString();      /* COUNT(*)가 전체수를 의미함*/
			ResultSet rs = stmt.executeQuery(sql);
			String count = "";
			while(rs.next()) {
				count = rs.getString("count");
			}
			System.out.println("테이블 수: " +count);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
