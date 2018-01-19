package com.kabank.mvc.serviceImpl;

import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;

import com.kabank.mvc.daoImpl.AccountDAOImpl;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.service.AccountService;

import oracle.net.ns.SessionAtts;
public class AccountServiceImpl implements AccountService{
	
	public static AccountService getInstance() {
		return new AccountServiceImpl();
	}
	private AccountServiceImpl() {
		
	}
	
	@Override
	public void openAccount() {
		String r = String.valueOf((int)(Math.random()*8899+1000)+"-"+(int)(Math.random()*8999+1000)+"-"+(int)(Math.random()*8999+1000));       
		System.out.println("계좌번호 :" +r);
		AccountDAOImpl.getInstance().insertAccount(r);
	}
	
	@Override
	public MemberBean findAccountById(String id) {
		return AccountDAOImpl.getInstance().selectAccountById(id);
	}
	@Override
	public MemberBean findMobileById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AccountBean findKakaoById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}




