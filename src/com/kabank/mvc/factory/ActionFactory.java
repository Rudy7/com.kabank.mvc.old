package com.kabank.mvc.factory;

import com.kabank.mvc.enums.Action;

public class ActionFactory {
	public static Action create(String x) {
		Action action = null;
		
		if(x==null || x.equals("") == true) {x = "move";}
		System.out.println("ACTION FACTORY move 입력 x:"+x);
		switch (x) {
		case "move":action=Action.MOVE;break;
		case "login":action=Action.LOGIN;break;
		case "change_pass":action=Action.CHANGE_PASS;break;
		case "deleteMember":action=Action.LEAVE_MEMBER; break;
		case "insert":action=Action.INSERT_MEMBER; break;
		
		default:
			action=Action.MOVE;
			break;
		}
		System.out.println("ACTION IS "+action.toString());
		return action;
	}
}
