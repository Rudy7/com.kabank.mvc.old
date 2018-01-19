package com.kabank.mvc.service;

import com.kabank.mvc.domain.AttendBean;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.MemberBean;

public interface AccountService {

	public void openAccount();

	public MemberBean findAccountById(String id);

	public MemberBean findMobileById(String id);
	
	public AccountBean findKakaoById(String id);
}
