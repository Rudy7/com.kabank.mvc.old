 package com.kabank.mvc.daoImpl;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.kabank.mvc.constants.DBMS;
import com.kabank.mvc.dao.MemberDAO;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.util.Enums;
import com.kabank.mvc.util.Enums.MemberColumn;

public class MemberDAOImpl implements MemberDAO{

	public static MemberDAO getInstance() {
		return new MemberDAOImpl();
	}
	private MemberDAOImpl() {
		try {
			Class.forName(DBMS.ORACLE_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	@Override
	public void insertMember(MemberBean member) {
		try {
			DriverManager.getConnection(DBMS.ORACLE_CONNECTION_URL, DBMS.ORACLE_USERNAME, DBMS.ORACLE_PASSWORD)
			.createStatement()
			.executeUpdate("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	@Override
	public void findMember(MemberBean member) {
			try {
				DriverManager.getConnection(DBMS.ORACLE_CONNECTION_URL, DBMS.ORACLE_USERNAME, DBMS.ORACLE_PASSWORD)
				.createStatement()
				.executeQuery("");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
	
}
