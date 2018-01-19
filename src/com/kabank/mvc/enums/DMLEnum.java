package com.kabank.mvc.enums;

public enum DMLEnum {
	COUNT{
		@Override
		public String toString() {
			return "SELECT COUNT(*) AS count FROM ";
		}
	},
	SELECT{
		@Override
		public String toString() {
			return "SELECT FROM ";
		}
	},
	INSERT{
		@Override
		public String toString() {
			return "INSERT INTO Member";
		}
	},
	SELECT_ID_PASS{
		@Override
		public String toString() {
			return "Member WHERE id = '%s' AND pass = '%s' ";
		}	
	},
	VALUES{
		@Override
		public String toString() {
			return "'%s','%s','%s','%s','%s','%s','%s','%s'";
		}
	},
	UPDATE_ID_PASS{
		@Override
		public String toString() {
			return "UPDATE Member SET pass = '%s' "
					+ "WHERE id = '%s'";
		}	
	},
	DELETE_MEMBER{
		@Override
		public String toString() {
			return "DELETE FROM MEMBER WHERE id='%s'";
		}
	},
	INSERTION_MEMBER{
		@Override
		public String toString() {
			return "INSERT INTO member(id,pass,name,ssn,phone,email,profile,addr)"
				 + "VALUES('%s','%s','%s','%s','%s','%s','%s','%s')";
		}
	},
	CREATE_KAKAO_ACCOUNT_NUM{
		@Override
		public String toString() {
			return "INSERT INTO BANK(ACCOUNT_NUM,MONEY,ID,CUSTOM_NUM)"
					+ "VALUES('%s','%s','%s',custom_num.nextval)";	
		}
	},
	CREATE_MOBILE_OPENING_NUM{
		@Override
		public String toString() {
			return "INSERT INTO MOBILE(CUSTOM_NUM,ID,PHONE,REG_DATE);"
					+ "VALUES(custom_num.nextval,'%s','%s','%s')";
		}
	}
	
	}

