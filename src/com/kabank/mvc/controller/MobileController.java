package com.kabank.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.MobileCommand;
import com.kabank.mvc.command.MoveCommand;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.serviceImpl.MobileServiceImpl;
import com.kabank.mvc.util.DispatcherSevlet;

@WebServlet("/Mobile.do")
public class MobileController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberBean member = new MemberBean();
		HttpSession session = request.getSession();
		switch(InitCommand.cmd.getAction()) {
		case MOVE:
			System.out.println("=================MOBILE-C : MOVE IN================");
			new MoveCommand(request).execute();
			System.out.println("DEST IS " + InitCommand.cmd.getView());
			System.out.println("=================MOBILE-C : MOVE OUT================");
			DispatcherSevlet.send(request, response);
			break;
		case OPENING:
			System.out.println("=================MOBILE-C : OPENING IN================");
			new MobileCommand(request).execute();
			InitCommand.cmd.setData(((MemberBean)request.getSession().getAttribute("user")).getId());
			MobileServiceImpl.getInstance().openingNum();
			System.out.println("개통할 폰번호 :" + InitCommand.cmd.getData());
			new MoveCommand(request).execute();
			System.out.println("=================MOBILE-C : OPENING OUT================");
			DispatcherSevlet.send(request, response);
			break;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	private void move(HttpServletRequest request) {
		new MoveCommand(request).execute();
	}

}
