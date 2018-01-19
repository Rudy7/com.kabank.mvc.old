package com.kabank.mvc.service;

import com.kabank.mvc.domain.AttendBean;
import com.kabank.mvc.domain.MemberBean;

public interface MemberService {

	public MemberBean findMemberById(MemberBean member);
	public void joinMember(MemberBean member);
	public MemberBean login();
	public void make(MemberBean param);
	public void changePass(MemberBean member);
	public void newPass_update(MemberBean member);
	public void nowIdDelete();
	public void memberInfo();
	public MemberBean findMemberById(String id);
}

