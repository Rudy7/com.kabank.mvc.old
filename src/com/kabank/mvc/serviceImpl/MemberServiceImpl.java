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
	public void joinMember(MemberBean member) {
		System.out.println("================MemberServiceImpl  joinMember 진입================");
		dao.insertMember(member);
	}

	@Override
	public MemberBean login() {
		return MemberDAOImpl.getInstance().login();
	}
	
}


