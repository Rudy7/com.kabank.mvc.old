package com.kabank.mvc.dao;

import java.util.List;

import com.kabank.mvc.domain.MemberBean;

public interface MemberDAO {
	public List<MemberBean> selectMembers();
	public void insertMember(MemberBean member);
	public MemberBean selectMemberById(MemberBean member);
	public MemberBean login();
}