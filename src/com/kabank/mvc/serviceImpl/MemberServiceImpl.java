package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.dao.MemberDAO;
import com.kabank.mvc.daoImpl.MemberDAOImpl;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.service.MemberService;

import sun.security.jca.GetInstance.Instance;

public class MemberServiceImpl implements MemberService {
	MemberDAO dao;
	public static MemberService getInstance() {
		return new MemberServiceImpl();
	}
	private MemberServiceImpl() {
		dao = MemberDAOImpl.getInstance();
	}
	
	@Override
	public void joinMember(MemberBean member) {
		dao.insertMember(member);
		
	}
	@Override
	public void findMemberById(MemberBean member) {
		dao.findMember(member);
		
	}
	
}


