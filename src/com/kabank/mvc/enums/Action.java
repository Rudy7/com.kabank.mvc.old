package com.kabank.mvc.enums;

public enum Action {
	MOVE, ADD, LOGIN, JOIN, SIGNUP, AUTH,SEARCH,COLUMN,CHANGE,
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
