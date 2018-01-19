package com.kabank.mvc.daoImpl;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.dao.MobileDAO;
import com.kabank.mvc.domain.MobileBean;
import com.kabank.mvc.enums.DMLEnum;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;

public class MobileDAOImpl implements MobileDAO{

	public static MobileDAO getInstance() {
		return  new MobileDAOImpl();
	}
	
	private MobileDAOImpl() {       //custom_num  id   phone   reg_date
	}
	
	@Override
	public void openingPhone(String rs) {
		System.out.println("======================MOBILE-DImpl : openingPhone IN======================");
		try {
			StringBuffer sql = new StringBuffer(DMLEnum.CREATE_MOBILE_OPENING_NUM.toString());
			System.out.println("sql : " + sql);
			DatabaseFactory.create(Vendor.ORACLE)
			.getConnection()
			.createStatement()
			.executeUpdate(String.format(sql.toString(), "custom_num.nextval", InitCommand.cmd.getData(), rs, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}   
		System.out.println("======================MOBILE-DImpl : openingPhone IN======================");
	}

	@Override
	public MobileBean selectMobileById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}
}
