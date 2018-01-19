package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.dao.AccountDAO;
import com.kabank.mvc.daoImpl.AccountDAOImpl;
import com.kabank.mvc.domain.AttendBean;
import com.kabank.mvc.service.AttendService;

public class AttendServiceImpl implements AttendService{
	public static AttendService getInstance() {
		return new AttendServiceImpl();
	}
	private AttendServiceImpl() {

	}
	@Override
	public AttendBean findAttendById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
