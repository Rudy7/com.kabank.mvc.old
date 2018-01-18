package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.dao.KakaoDAO;
import com.kabank.mvc.daoImpl.KakaoDAOImpl;
import com.kabank.mvc.enums.DDLEnum;
import com.kabank.mvc.service.KakaoService;

public class KakaoServiceImpl implements KakaoService{
	
	public static KakaoService getInstance() {
		return new KakaoServiceImpl();
	}
	public KakaoServiceImpl() {
	}
	
	@Override
	public void openAccount() {
		String r = String.valueOf((int)(Math.random()*8899+1000)+"-"+(int)(Math.random()*8999+1000)+"-"+(int)(Math.random()*8999+1000));       
		System.out.println("계좌번호 :" +r);
		KakaoDAOImpl.getInstance().insertAccount(r);
	}
}




