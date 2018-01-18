package com.kabank.mvc.util;

import java.util.HashMap;

public class Enums {
	public enum MemberColumn {
		ID,PASS,NAME,SSN,PHONE,EMAIL,PROFILE,ADDR	
	}
	public enum AttendColumn {
		ID,PASS,NAME,SSN,PHONE,EMAIL,PROFILE,ADDR
	}	
	public enum Table{
		MEMBER,ATTEND,ADMIN
	}	
	public enum DML{
		SELECT,INSERT,INTO,UPDATE,DELETE,FROM, WHERE
	}
	public enum AccountColumn{
		ACCOUNT_NUM,MONEY,ID,CUSTOM_NUM; 
	}
	public static String getSql() {
		String sql="";
		return sql;
	}
	public static String getTableName(String key) {
		HashMap<String, String> map = new HashMap<String, String>();
			for(Enums.Table c: Enums.Table.values()) {
				String tmp = c +"";
				map.put(tmp, tmp);
			}
			return map.get(key);
		}
	 public static String getMemberColumn() {
		 String res = "";
		MemberColumn[] member = Enums.MemberColumn.values();
		for(int i=0; i<member.length; i++) {
			if(i!=member.length-1) {
				res += member[i]+ ",";
			}else {
				res += member[i];
			}
		}
		return res;
	 }
	public static String getBlanks(int count) {
		String blanks = "'%s'";
		String res = "";
		for(int i=0; i<count; i++) {
			if(i != count-1) {
					res += blanks + ",";
			}else {
					res += blanks;
			}
		}
		return blanks;
	}
	/*StringBuffer sql = new StringBuffer*/
			/*(DMLEnum.INSERT.toString()).insert(11, " "+ TnameEnum.BANK+ " ("+Enums.getAccountColumn()+")").append("("+Enums.getBlanks(Enums.AccountColumn.values().length)+")");*/
}			  	






