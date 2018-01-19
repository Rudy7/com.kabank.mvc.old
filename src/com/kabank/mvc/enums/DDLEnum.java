package com.kabank.mvc.enums;

public enum DDLEnum {
	CREATE_TABLE_MEMBER{
		@Override
		public String toString() {
			return "CREATE TABLE Member("
			+" id VARCHAR2(20) PRIMARY KEY,"
			+" pass VARCHAR2(20),"
			+" name VARCHAR2(20),"
			+" ssn VARCHAR2(20),"
			+" phone VARCHAR2(20),"
			+" email VARCHAR2(20),"
			+" profile VARCHAR2(20),"
			+" addr VARCHAR2(20)"
			+")";
		} 
	},
	CREATE_TABLE_ATTEND{
		@Override
		public String toString() {
			return "CREATE TABLE Attend("
					+" id VARCHAR2(20) PRIMARY KEY,"
					+" week VARCHAR2(20),"
					+" status VARCHAR2(10)"
				    +")";
		}
	},
	CREATE_TABLE_BANK{
		@Override
		public String toString() {
			return "CREATE TABLE bank("
					+"customNum VARCHAR2(20) PRIMARY KEY,"
					+"accountNum VARCHAR2(20),"
					+"money VARCHAR2(20),"
					+"id VARCHAR2(20),"
					+"FOREIGN KEY(id) references member(id) on delete cascade"     
					+")";
		}
	}, 
	CREATE_TABLE_MOBILE{
		@Override
		public String toString() {
			return "CREATE TABLE Mobile("
					+" custom_num int PRIMARY KEY,"
					+" id VARCHAR2(20),"
					+" phone VARCHAR2(20) not null,"
					+" reg_date date not null,"
					+" FOREIGN KEY(id) references member(id) on delete cascade"			
					+")";
		}
	}
	
}
