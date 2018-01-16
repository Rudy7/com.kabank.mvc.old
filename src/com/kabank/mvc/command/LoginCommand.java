package com.kabank.mvc.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import com.kabank.mvc.iterator.ParamsIterator;

public class LoginCommand implements IOrder{   //daoimpl 에다가 id 와 pass만 준다. 
	Map<?,?> map;
	public LoginCommand(HttpServletRequest request) {
		map = ParamsIterator.execute(request);
	}
	@Override
	public void execute() {
		String id = String.valueOf(map.get("id"));
		String pass = String.valueOf(map.get("pass"));
		InitCommand.cmd.setColum("id/pass");
		InitCommand.cmd.setData(id+"/"+pass);
	}	
}
