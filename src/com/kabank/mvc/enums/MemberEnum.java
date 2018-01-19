package com.kabank.mvc.enums;

import com.kabank.mvc.util.Enums.DML;

public enum MemberEnum {
	ID,PASS,NAME,SSN,PHONE,EMAIL,PROFILE,ADDR,ACCOUNT_NUM,CUSTOM_NUM, MONEY,
	
	PROFERTIES{
		@Override
		public String toString() {
			return ID+","+PASS+","+NAME+","+SSN+","+PHONE+","+EMAIL+","+PROFILE+","+ADDR; 
		}
	},
	LOGIN{
		@Override
		public String toString() {
			return  "select "
					+ " id,"
					+ "pass,"
					+ "name,"
					+ "ssn,"
					+ "phone,"
					+ "email,"
					+ "profile,"
					+ "addr"
					+ " FROM Member"
					+ " WHERE id LIKE '%s'"
					+ "and pass LIKE '%s'"
					;
		}
	},
	KAKAOA_CCOUNT_SELECT{
		@Override
		public String toString() {
			return "SELECT"
					+" a.custom_num,"
					+" m.id,"
					+" m.pass,"
					+" m.name,"
					+" m.ssn,"
					+" m.phone,"
					+" m.email,"
					+" m.addr,"
					+" m.profile,"
					+" a.account_num,"
					+" a.money"
					+" FROM Member m, bank a"
					+" WHERE m.id = a.id"
					+" AND m.id LIKE '%s'"
					;
		}
	}
}	       
	
	







	
/*	"SELECT "
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
	+" FROM Member m, bank a"
	+" WHERE m.id = a.id"
	+" AND m.id LIKE ?" 
	+" order by a.custom_num asc";*/


/*"SELECT "
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
+" FROM Member m, bank a"
+" WHERE m.id = a.id"
+" order by a.custom_num asc"
+" WHERE id LIKE '$' AND pass LIKE '@'";*/


/*return "SELECT ID, PASS, NAME, SSN, PHONE, EMAIL, ADDR, PROFILE FROM Member"
+" WHERE id LIKE '$' AND pass LIKE '@'" ;*/