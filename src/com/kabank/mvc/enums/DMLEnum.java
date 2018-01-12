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
	}
	}

