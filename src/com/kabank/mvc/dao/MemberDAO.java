package com.kabank.mvc.dao;

import java.util.List;

import com.kabank.mvc.domain.MemberBean;

public interface MemberDAO {

	public void insertMember(MemberBean member);

	public void findMember(MemberBean member);
	
}