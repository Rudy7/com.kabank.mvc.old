package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.daoImpl.MobileDAOImpl;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.domain.MobileBean;
import com.kabank.mvc.service.MobileService;

public class MobileServiceImpl implements MobileService{

	public static MobileService getInstance() {
		return new MobileServiceImpl();
	}
	private MobileServiceImpl() {
		
	}
	@Override
	public void openingNum() {
		String rs = String.valueOf((int)(Math.random()*8899+1000)+"-"+(int)(Math.random()*8999+1000));     
		System.out.println("핸드폰번호 :" +rs);
		MobileDAOImpl.getInstance().openingPhone(rs);
	}
	@Override
	public MobileBean findMobileById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
