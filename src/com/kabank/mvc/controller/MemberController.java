package com.kabank.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.MoveCommand;
import com.kabank.mvc.command.LoginCommand;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.enums.Action;
import com.kabank.mvc.enums.MemberEnum;
import com.kabank.mvc.factory.ActionFactory;
import com.kabank.mvc.service.MemberService;
import com.kabank.mvc.serviceImpl.MemberServiceImpl;
import com.kabank.mvc.util.DispatcherSevlet;
import com.sun.org.apache.xml.internal.security.Init;
import sun.rmi.server.Dispatcher;

@WebServlet({"/user.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		InitCommand init = new InitCommand(request);
		init.execute();
		switch (InitCommand.cmd.getAction()) {
		case MOVE:
			System.out.println("==============MEMBER-C: MOVE IN============");
			move(request);
			System.out.println("DEST IS " + InitCommand.cmd.getView());
			System.out.println("==============MEMBER-C: MOVE OUT============");
			DispatcherSevlet.send(request, response);break;
		case ADD:
			break;
		case JOIN:
			break;
		case SIGNUP:
			
			break;
		case AUTH:
			MemberBean param = new MemberBean();
			param.setId(request.getParameter(MemberEnum.ID.name()));
			param.setPass(request.getParameter(MemberEnum.PASS.name()));
			param.setName(request.getParameter(MemberEnum.NAME.name()));
			param.setSsn(request.getParameter(MemberEnum.SSN.name()));
			param.setPhone(request.getParameter(MemberEnum.PHONE.name()));
			param.setEmail(request.getParameter(MemberEnum.EMAIL.name()));
			param.setProfile(request.getParameter(MemberEnum.PROFILE.name()));
			param.setAddr(request.getParameter(MemberEnum.ADDR.name()));			
			
			break;
		case LOGIN:
			System.out.println("----------------MEMBER-C : LOGIN IN---------------");
			new LoginCommand(request).execute();
			MemberBean member = MemberServiceImpl.getInstance().login();
			if(member==null) {
				System.out.println("로그인 실패");
				InitCommand.cmd.setDir("user");
				InitCommand.cmd.setPage("login");
			}else {
				System.out.println("로그인 성공");
				session.setAttribute("user", member);
				InitCommand.cmd.setDir("bitcamp");
				InitCommand.cmd.setPage("main");
			}
			move(request);
			System.out.println("DEST IS " +InitCommand.cmd.getView());
			System.out.println("----------------MEMBER-C:  LOGIN OUT---------------");
			DispatcherSevlet.send(request, response);break;
		/*case CHANGE:
			System.out.println("----------------MEMBER-C:  LOGIN IN CHANGE---------------");
			new LoginCommand(request).execute();
			move(request);
			DispatcherSevlet.send(request, response);
			System.out.println("----------------MEMBER-C:  LOGIN IN CHANGE---------------");
			break;*/
		default:
			break;
		}
	}
	private void move(HttpServletRequest request) {
		new MoveCommand(request).execute();
	}

}
