package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.constants.AdminSql;
import com.kabank.mvc.dao.AdminDAO;
import com.kabank.mvc.daoImpl.AdminDAOImpl;
import com.kabank.mvc.service.AdminService;

public class AdminServiceImpl implements AdminService {

	@Override
	public void createTable(String tname) {
		// TODO Auto-generated method stub
		System.out.println("================관리자 서비스임플 진입==============");
		AdminDAO dao = new AdminDAOImpl();
		String sql ="";
		switch (tname) {
		case "member":
			sql = AdminSql.CREATE_MEMBER;
			break;
		case "attend":
			sql = AdminSql.CREATE_ATTEND;
			break;
		default:
			break;
		}
		dao.makeTable(sql);
		
	}
}	