package com.kabank.mvc.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.dao.CommonDAO;
import com.kabank.mvc.dao.AccountDAO;
import com.kabank.mvc.enums.DMLEnum;
import com.kabank.mvc.enums.OracleEnum;
import com.kabank.mvc.enums.TnameEnum;

public class CommonDAOImpl implements CommonDAO{
	
	String count = "";
	@Override
	public String selectTableCount(Command cmd) {
	
		try {
			Class.forName(OracleEnum.ORACLE_DRIVER.value);       
			Connection conn = DriverManager.getConnection(OracleEnum.ORACLE_CONNECTION_URL.value,
					  OracleEnum.ORACLE_USERNAME.value, 
					  OracleEnum.ORACLE_PASSWORD.value);
			Statement stmt = conn.createStatement();	
			ResultSet rs = stmt.executeQuery(
					DMLEnum.COUNT.toString()
					+TnameEnum.MEMBER);
			while(rs.next()) {
				count = rs.getString("count");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
}

