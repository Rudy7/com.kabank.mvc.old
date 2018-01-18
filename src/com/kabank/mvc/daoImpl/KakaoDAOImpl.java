package com.kabank.mvc.daoImpl;

import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.dao.KakaoDAO;
import com.kabank.mvc.enums.DMLEnum;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;

public class KakaoDAOImpl implements KakaoDAO{
	
	public static KakaoDAO getInstance() {
		return new KakaoDAOImpl();
	}
	public KakaoDAOImpl() {

	}
	
	@Override
	public void insertAccount(String r) {
		System.out.println("======================KAKAO-D : kakaoCreateAccount IN======================");
		try {
			StringBuffer sql = new StringBuffer(DMLEnum.CREATE_KAKAO_ACCOUNT_NUM.toString());
			System.out.println("Enums : " +DMLEnum.CREATE_KAKAO_ACCOUNT_NUM.toString());
			System.out.println("sql :" +sql);
			DatabaseFactory.create(Vendor.ORACLE)
			.getConnection()
			.createStatement()
			.executeUpdate(String.format(sql.toString(), r, 0 ,InitCommand.cmd.getData(),"custom_num.nextval" ));
			
			/*String[] arr = InitCommand.cmd.getData().split("/");
			for(int i=0; i<arr.length; i++) {
				stmt.setString((i+1), arr[i]);			
			}*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("======================KAKAO-D : kakaoCreateAccount IN======================");	
	}		

}
