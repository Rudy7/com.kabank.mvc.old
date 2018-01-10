package com.kabank.mvc.service;

import com.kabank.mvc.domain.MemberBean;

public interface MemberService {

	public void joinMember(MemberBean member);

	public void findMemberById(MemberBean member);
	
}

