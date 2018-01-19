package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.dao.MemberDAO;
import com.kabank.mvc.daoImpl.MemberDAOImpl;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.service.MemberService;

public class MemberServiceImpl implements MemberService {
	MemberDAO dao;
	
	public static MemberService getInstance() {
		return new MemberServiceImpl();
	}

	private MemberServiceImpl() {
		dao = MemberDAOImpl.getInstance();
	}
	
	@Override
	public MemberBean findMemberById(MemberBean member) {
		return dao.selectMemberById(member);
	}
	
	@Override
	public void make(MemberBean member) {
		// TODO Auto-generated method stub
		System.out.println("================MemberServiceImpl  joinMember 진입================");
		dao.insertMember(member);
		
	}

	@Override
	public MemberBean login() {
		return MemberDAOImpl.getInstance().login();
	}

	@Override
	public void joinMember(MemberBean member) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void changePass(MemberBean member) {
		MemberDAOImpl.getInstance().updatePass(member);
		
	}

	@Override
	public void newPass_update(MemberBean member) {
		dao.newPass_alter(member);
		
	}

	@Override
	public void nowIdDelete() {
		dao.nowId_leave();
		
	}

	@Override
	public void memberInfo() {
		dao.memberTuple();
		
	}

	@Override
	public MemberBean findMemberById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


