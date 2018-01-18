 package com.kabank.mvc.daoImpl;
 
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.dao.MemberDAO;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.enums.AccountProps;
import com.kabank.mvc.enums.DMLEnum;
import com.kabank.mvc.enums.MemberEnum;
import com.kabank.mvc.enums.TnameEnum;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;

public class MemberDAOImpl implements MemberDAO{
	public static MemberDAO getInstance() {return new MemberDAOImpl();}
	private MemberDAOImpl() {}
	Statement stam;
	String sql;
	ResultSet rs;
	MemberBean m;
	@Override
	public List<MemberBean> selectMembers() {
		System.out.println("========================List<MemberBean> selectMembers() 진입=========================");
		List<MemberBean> result = new ArrayList<>();
		try {
			StringBuffer sql = new StringBuffer(DMLEnum.SELECT.toString()).insert(6, " *").append(TnameEnum.MEMBER);
			ResultSet rs = DatabaseFactory.create(Vendor.ORACLE).getConnection().createStatement().executeQuery(sql.toString());
			while(rs.next()) {
				MemberBean member = new MemberBean();
				String id = rs.getString("id");
				String pass = rs.getString("pass");
				member.setId(id);
				member.setPass(pass);
				result.add(member);	
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public void insertMember(MemberBean member) {
		System.out.println("==========================MemberDAOImpl insertMember 진입======================");
		System.out.println("member.getId() : " +member.getId());
		try {
			DatabaseFactory.create(Vendor.ORACLE).getConnection()
			.createStatement().executeUpdate(String.format(DMLEnum.INSERT.toString()+"("
					+ MemberEnum.PROFERTIES.toString()
					+")VALUES("+DMLEnum.VALUES.toString()+") ",
					member.getId(), member.getPass(), member.getName(), member.getSsn(),
					member.getPhone(), member.getProfile(), member.getEmail(), member.getAddr()));
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	@Override
	public MemberBean selectMemberById(MemberBean member) {
		System.out.println("-----------------selectMemberById  IN-----------------");
		System.out.println("-----------------ID : " + member.getId()+"-----------------");
		System.out.println("-----------------ID : " + member.getPass()+"-----------------");
		MemberBean mem = null;
		try {
			StringBuffer sql = new StringBuffer(DMLEnum.SELECT_ID_PASS.toString());
			ResultSet rs = DatabaseFactory.create(Vendor.ORACLE).getConnection().
							createStatement().executeQuery(String.format(sql.toString(), member.getId(),member.getPass()));     
		while(rs.next()) {
			mem = new MemberBean();
			mem.setId(rs.getString(MemberEnum.ID.name()));
			mem.setPass(rs.getString(MemberEnum.PASS.name()));
			mem.setName(rs.getString(MemberEnum.NAME.name()));
			mem.setSsn(rs.getString(MemberEnum.SSN.name()));
			mem.setPhone(rs.getString(MemberEnum.PHONE.name()));
			mem.setEmail(rs.getString(MemberEnum.EMAIL.name()));
			mem.setProfile(rs.getString(MemberEnum.PROFILE.name()));
			mem.setAddr(rs.getString(MemberEnum.ADDR.name()));
			System.out.println("개인정보 :" + MemberEnum.ID.name() + MemberEnum.PASS.name());
			}
		} catch (Exception e) {
		} 
		System.out.println("-----------------SPEC: "+ member.toString() +"IN -----------------");
		System.out.println("-----------------selectMemberById  IN-----------------");
		return mem;
	}
	@Override
	public MemberBean login() {
		System.out.println("===============MEMBER-D: LOGIN IN===============");
		
		System.out.println(":::SQL:::"+MemberEnum.LOGIN.toString());
		MemberBean member = null;
		AccountBean account = null;
		String[] t = InitCommand.cmd.getData().split("/");
		try {
			ResultSet rs = DatabaseFactory.create(Vendor.ORACLE)
					.getConnection()
					.createStatement()
					.executeQuery(String.format(MemberEnum.LOGIN.toString(),t[0],t[1] ) );
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
				member.setAccount(account);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("===============MEMBER-D: LOGIN OUT===============");
		return member;
	}
	@Override
	public void updatePass(MemberBean member) {
		
	}
	
	@Override
	public void newPass_alter(MemberBean member) {
		System.out.println("===============MEMBER-D: newPass_alter IN===============");
		try {
			StringBuffer sql = new StringBuffer(DMLEnum.UPDATE_ID_PASS.toString());
			DatabaseFactory.create(Vendor.ORACLE)
			.getConnection()
			.createStatement()
			.executeUpdate(String.format(sql.toString(), member.getPass(), member.getId()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("===============MEMBER-D: newPass_alter OUt===============");
	}
	
	@Override
	public void nowId_leave() {
		System.out.println("===============MEMBER-D: nowId_leave IN===============");
		try {	
			StringBuffer sql = new StringBuffer(DMLEnum.DELETE_MEMBER.toString());
			DatabaseFactory.create(Vendor.ORACLE)
			.getConnection()
			.createStatement()
			.executeUpdate(String.format(sql.toString(), InitCommand.cmd.getData()));
		} catch (Exception e) {
			e.printStackTrace();
		}
			System.out.println("===============MEMBER-D: nowId_leave OUT===============");
		}
	@Override
	public void memberTuple() {
		System.out.println("===============MEMBER-D: memberTuple IN===============");
		String[] arr = InitCommand.cmd.getData().split("/");
			StringBuffer sql = new StringBuffer(DMLEnum.INSERTION_MEMBER.toString());
			try {
				DatabaseFactory.create(Vendor.ORACLE)
				.getConnection()
				.createStatement()
				.executeUpdate(String.format(sql.toString(),arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7]));
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("===============MEMBER-D: memberTuple OUT===============");
	}
}







