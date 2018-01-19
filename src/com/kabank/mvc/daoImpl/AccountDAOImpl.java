package com.kabank.mvc.daoImpl;

import java.sql.ResultSet;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.dao.AccountDAO;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.enums.DMLEnum;
import com.kabank.mvc.enums.MemberEnum;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;

public class AccountDAOImpl implements AccountDAO{
	
	public static AccountDAO getInstance() {
		return new AccountDAOImpl();
	}
	private AccountDAOImpl() {

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
		AccountBean account = null;
		try {
			StringBuffer sql = new StringBuffer(MemberEnum.KAKAOA_CCOUNT_SELECT.toString());
			
			System.out.println("sql :" + sql);
			ResultSet rs = DatabaseFactory
							.create(Vendor.ORACLE)
							.getConnection()
							.createStatement()
							.executeQuery(String.format(sql.toString(),id));
			while(rs.next()) {
				mem = new MemberBean();
				account = new AccountBean();
				mem.setId(rs.getString(MemberEnum.ID.name()));
				mem.setPass(rs.getString(MemberEnum.PASS.name()));
				mem.setName(rs.getString(MemberEnum.NAME.name()));
				mem.setSsn(rs.getString(MemberEnum.SSN.name()));
				mem.setPhone(rs.getString(MemberEnum.PHONE.name()));
					System.out.println("폰번호 "+MemberEnum.PHONE.name());
				mem.setEmail(rs.getString(MemberEnum.EMAIL.name()));
				mem.setProfile(rs.getString(MemberEnum.PROFILE.toString()));
				mem.setAddr(rs.getString(MemberEnum.ADDR.name()));
				account.setAccountNum(rs.getString(MemberEnum.ACCOUNT_NUM.name()));
				account.setCustomNum(rs.getString(MemberEnum.CUSTOM_NUM.name()));
				account.setMoney(rs.getString(MemberEnum.MONEY.name()));
				mem.setAccount(account);
					System.out.println("-------------------mem : ----------------"+mem);
				System.out.println("account : " +account);
				System.out.println("개인정보 :" + MemberEnum.ID.name());
				System.out.println(MemberEnum.ACCOUNT_NUM.name() + MemberEnum.CUSTOM_NUM.name());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("======================KAKAO-D : selectAccountById OUT======================");	
		return mem;
	}
	@Override
	public AccountBean selectKakaoById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}		
}







/*String[] arr = InitCommand.cmd.getData().split("/");
			for(int i=0; i<arr.length; i++) {
				stmt.setString((i+1), arr[i]);			
			}*/