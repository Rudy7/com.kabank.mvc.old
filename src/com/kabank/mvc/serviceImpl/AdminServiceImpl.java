package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.dao.AdminDAO;
import com.kabank.mvc.daoImpl.AdminDAOImpl;
import com.kabank.mvc.enums.DDLEnum;
import com.kabank.mvc.service.AdminService;

public class AdminServiceImpl implements AdminService {
	AdminDAO dao;
	public static AdminService getInstance() {
		return new AdminServiceImpl();
	}
	/*(private)*/public AdminServiceImpl() {
		dao = AdminDAOImpl.getInstance();
	}

	@Override
	public void createTable(String tname) {
		System.out.println("================관리자 서비스임플 진입==============");
		AdminDAO dao = new AdminDAOImpl();
		String sql ="";
		switch (tname) {
		case "member":
			sql = DDLEnum.CREATE_TABLE_MEMBER.toString();
			break;
		case "attend":
			sql = DDLEnum.CREATE_TABLE_ATTEND.toString();
			break;
		case "bank":
			sql = DDLEnum.CREATE_TABLE_BANK.toString();
			break;
		default:
			break;
		}
		dao.makeTable(sql);
	}

	@Override
	public void kakaoCreateTable(String tname) {
		AdminDAO dao = new AdminDAOImpl();
		String sql="";
		sql = DDLEnum.CREATE_TABLE_BANK.toString();
		dao.kakaoCreateTable(sql);
		
		
	}
}	