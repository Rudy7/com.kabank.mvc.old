package com.kabank.mvc.service;

import com.kabank.mvc.domain.MemberBean;

public interface KakaoService {

	public void openAccount();

	public MemberBean findAccountById(String id);
	
}
