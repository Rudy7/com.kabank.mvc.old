package com.kabank.mvc.dao;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.domain.MobileBean;

public interface MobileDAO {

	public void openingPhone(String rs);

	public MobileBean selectMobileById(Command cmd);
	
}
