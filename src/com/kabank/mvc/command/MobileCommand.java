package com.kabank.mvc.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.iterator.ParamsIterator;

public class MobileCommand implements IOrder{
	Map<?,?> map;
	HttpSession session;
	public MobileCommand(HttpServletRequest request) {
		map = ParamsIterator.execute(request);
		session = request.getSession();
	}
	
	@Override
	public void execute() {
		System.out.println("===========map===========: " + map);
		InitCommand.cmd.setData(
				(((MemberBean)session
						.getAttribute("user"))
						.getId())
		);
	}

	
}
