package com.kabank.mvc.daoImpl;

import java.sql.ResultSet;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.dao.KakaoDAO;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.enums.DMLEnum;
import com.kabank.mvc.enums.MemberEnum;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;

public class KakaoDAOImpl implements KakaoDAO{
	
	public static KakaoDAO getInstance() {
		return new KakaoDAOImpl();
	}
	public KakaoDAOImpl() {

	}
	ResultSet rs;
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("======================KAKAO-D : kakaoCreateAccount OUN======================");	
	}
	
	
	@Override
	public MemberBean selectAccountById(String id) {
		System.out.println("======================KAKAO-D : selectAccountById IN======================");	
		MemberBean mem = null;
		try {
			StringBuffer sql = new StringBuffer(MemberEnum.KAKAOA_CCOUNT_SELECT.toString());
			System.out.println("MemberEnum.KAKAOA_CCOUNT_SELECT.toString() :" + MemberEnum.KAKAOA_CCOUNT_SELECT.toString());
			System.out.println("sql :" + sql);
			ResultSet rs = DatabaseFactory
							.create(Vendor.ORACLE)
							.getConnection()
							.createStatement()
							.executeQuery(String.format(sql.toString(),id));
			while(rs.next()) {
				mem = new MemberBean();
				mem.setId(rs.getString(MemberEnum.ID.name()));
				
				
				System.out.println("개인정보 :" + MemberEnum.ID.name());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("======================KAKAO-D : selectAccountById OUT======================");	
		return mem;
	}		
}



/*String[] arr = InitCommand.cmd.getData().split("/");
			for(int i=0; i<arr.length; i++) {
				stmt.setString((i+1), arr[i]);			
			}*/