package com.kabank.mvc.enums;

public enum Action {
	MOVE, ADD, LOGIN, JOIN, SIGNUP, AUTH, SEARCH, 
	COLUMN, CHANGE_PASS, LEAVE_MEMBER, INSERT_MEMBER,
	OPEN_ACCOUNT, OPENING, MYPAGE, LOGOUT,
	VIEW{
		@Override
		public String toString() {
			return "/WEB-INF/view/";
		}
	},
	EXTENSION{
	@Override
		public String toString() {
			return ".jsp";
		}
	},
	SEPARAOR{
		@Override
		public String toString() {
			return "/";
		}
	} 
}

