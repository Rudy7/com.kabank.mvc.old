package com.kabank.mvc.constants;

public class CommonSQL {
	public static String getCount(String tname) {            //메소드의 기본 필수
		return "SELECT COUNT(*) AS count FROM " + tname;
		
	}
}













/*public String getCount() {          //메소드의 기본 필수
	String foo = "SELECT COUNT(*) AS count FROM" + tname;
	return foo;
}*/