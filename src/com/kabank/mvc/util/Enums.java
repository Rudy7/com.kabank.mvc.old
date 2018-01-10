package com.kabank.mvc.util;

import java.util.HashMap;

public class Enums {
	public enum MemberColumn {
		ID,Pass,NAME,SSN,PHONE,EMAIL,PROFILE,ADDR	
	}
	public enum AttendColumn {
		ID,pass,Name,SSN,PHONE,EMAIL,PROFILE,ADDR
	}	
	public enum Table{
		MEMBER,ATTEND,ADMIN
	}	
	public enum DML{
		SELECT,INSERT,INTO,UPDATE,DELETE,FROM
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
		 String tmp = "";
		 for(Enums.MemberColumn c : Enums.MemberColumn.values()) {
			 if(c.ordinal()==6) {
				 	tmp += c;
			 }else {
				    tmp += c +",";
			 }
		 }
		return tmp;
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
}	
