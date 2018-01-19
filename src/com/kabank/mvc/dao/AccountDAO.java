package com.kabank.mvc.dao;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.MemberBean;

public interface AccountDAO {


	void insertAccount(String r);

	MemberBean selectAccountById(String id);
	
	public AccountBean selectKakaoById(Command cmd);
}
