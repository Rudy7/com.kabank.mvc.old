/*package com.kabank.mvc.query.member;

import java.sql.PreparedStatement;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.enums.MemberEnum;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;
import com.kabank.mvc.util.Enums.DML;

public class LoginQuery implements IQuery {
		PreparedStatement pstmt;
		public LoginQuery() {
			try {
			 pstmt = DatabaseFactory.create(Vendor.ORACLE)
					 			.getConnection()
					 			.prepareStatement(
					 					DML.SELECT
					 					+" "
										+"a.custom_num,"
										+"m.id,"
										+"m.pass,"
										+"m.name,"
										+"m.ssn,"
										+"m.phone,"
										+"m.email,"
										+"m.addr,"
										+"a.account_num,"
										+"a.money"
										+DML.FROM
										+" Member m, bank a "
										+DML.WHERE
										+" m.id LIKE ? AND m.pass LIKE ?");
			 String[] arr = InitCommand.cmd.getData().split("/");
			 for(int i=0; i<arr.length; i++) {
				 pstmt.setString((i+1), arr[i]);
				 System.out.println("인덱스 값 :" + (i+1));
				 System.out.println("입력 값 :" + arr[i]);
			 }
			 for(int i=0; i<arr.length; i++) {
				 pstmt.setString((i+1), arr[i]);	
			 }		 					
		} catch (Exception e) {
				e.printStackTrace();
		}
	}
	@Override
	public Object execute() {
		MemberBean member = null;
		AccountBean account = null;
		try {
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					member = new MemberBean();
					member.setId(rs.getString(MemberEnum.ID.toString()));
					member.setPass(rs.getString(MemberEnum.PASS.toString()));
					member.setName(rs.getString(MemberEnum.NAME.toString()));
					member.setEmail(rs.getString(MemberEnum.EMAIL.toString()));
					member.setAddr(rs.getString(MemberEnum.ADDR.toString()));
					member.setPhone(rs.getString(MemberEnum.PHONE.toString()));
					member.setSsn(rs.getString(MemberEnum.SSN.toString()));
					member.setProfile(rs.getString(MemberEnum.PROFILE.toString()));	
					account.setAccountNum(rs.getString(AccountProps.ACCOUNT_NUM.toString()));
					account.setCustomNum(rs.getString(AccountProps.CUSTOMER_NUM.toString()));
					account.setAccountNum(rs.getString(AccountProps.MONEY.toString()));
					CREATE_KAKAO_ACCOUNT_NUM
					member.setAccount(account);
				}
		} catch (Exception e) {
				e.printStackTrace();
		}
		  return member;
	}
	
}
*/