package com.kabank.mvc.dao;

import com.kabank.mvc.domain.MemberBean;

public interface KakaoDAO {


	void insertAccount(String r);

	MemberBean selectAccountById(String id);

}
