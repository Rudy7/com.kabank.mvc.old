package com.kabank.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.AccountCommand;
import com.kabank.mvc.command.MoveCommand;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.serviceImpl.AccountServiceImpl;
import com.kabank.mvc.util.DispatcherSevlet;

@WebServlet("/kakao.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			System.out.println("====================카카오뱅크 컨트롤로 진입 ================");
			/*KakaoService service = KakaoServiceImpl.getInstance();*/
			MemberBean member = new MemberBean();
			HttpSession session = request.getSession();
			InitCommand init = new InitCommand(request);
			init.execute();
			switch (InitCommand.cmd.getAction()) {
			case MOVE:
				System.out.println("==============MEMBER-C: MOVE IN============");
				new MoveCommand(request).execute();
				System.out.println("DEST IS " + InitCommand.cmd.getView());
				System.out.println("==============MEMBER-C: MOVE OUT============");
				DispatcherSevlet.send(request, response);break;
			case OPEN_ACCOUNT:
				System.out.println("통장개설 클릭2 KAKAOBANK-C : openAccount IN");
				/*service = new KakaoServiceImpl();*/
				new AccountCommand(request).execute();
				InitCommand.cmd.setData(((MemberBean)request.getSession().getAttribute("user")).getId());
				AccountServiceImpl.getInstance().openAccount();
				System.out.println("입력할 계좌번호 :" +InitCommand.cmd.getData());
				new MoveCommand(request).execute();
				System.out.println("통장개설 클릭2 KAKAOBANK-C : openAccount OUT");
				DispatcherSevlet.send(request, response); break;
				
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
