package com.kabank.mvc.service;

import com.kabank.mvc.domain.AttendBean;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.domain.MobileBean;

public interface MobileService {

	public void openingNum();

	/*MemberBean findMobileById(String id);*/
	
	public MobileBean findMobileById(String id);
}
