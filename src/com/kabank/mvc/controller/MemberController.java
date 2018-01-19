package com.kabank.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.kabank.mvc.command.ChangeCommand;
import com.kabank.mvc.command.DeleteCommand;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.InsertCommand;
import com.kabank.mvc.command.MoveCommand;
import com.kabank.mvc.command.LoginCommand;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.enums.MemberEnum;
import com.kabank.mvc.service.MemberService;
import com.kabank.mvc.serviceImpl.AccountServiceImpl;
import com.kabank.mvc.serviceImpl.MemberServiceImpl;
import com.kabank.mvc.serviceImpl.MobileServiceImpl;
import com.kabank.mvc.util.DispatcherSevlet;

@WebServlet({"/user.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberService service = MemberServiceImpl.getInstance();
		HttpSession session = request.getSession();
		InitCommand init = new InitCommand(request);
		init.execute();
		MemberBean member = null;
		switch (InitCommand.cmd.getAction()) {
		case MOVE:
			System.out.println("==============MEMBER-C: MOVE IN============");
			move(request);
			System.out.println("DEST IS " + InitCommand.cmd.getView());
			System.out.println("==============MEMBER-C: MOVE OUT============");
			DispatcherSevlet.send(request, response);break;
		case ADD:
			member = new MemberBean();
			member.setId(request.getParameter(MemberEnum.ID.name()));
			member.setPass(request.getParameter(MemberEnum.PASS.name()));
			member.setName(request.getParameter(MemberEnum.NAME.name()));
			member.setSsn(request.getParameter(MemberEnum.SSN.name()));
			member.setPhone(request.getParameter(MemberEnum.PHONE.name()));
			member.setEmail(request.getParameter(MemberEnum.EMAIL.name()));
			member.setProfile(request.getParameter(MemberEnum.PROFILE.name()));
			member.setAddr(request.getParameter(MemberEnum.ADDR.name()));	
			service.make(member);
			break;
		case JOIN:
			
			break;
		case SIGNUP:
			System.out.println("회원가입에서 SIGNUP로 MEMBER-C: SIGNUP 도착");
			break;
		case AUTH:	
		case CHANGE_PASS:
			System.out.println("----------------MEMBER-C : CHANGE_PASS IN---------------");
			member = new MemberBean();
			member = (MemberBean) session.getAttribute("user");
			new ChangeCommand(request).execute();
			System.out.println("변경할 비번 :" +InitCommand.cmd.getData());
			String id = ((MemberBean) session.getAttribute("user")).getId();
			member.setId(id);
			member.setPass(InitCommand.cmd.getData());
			MemberServiceImpl.getInstance().newPass_update(member);
			session.setAttribute("user", member);
			System.out.println("변경확인");
			System.out.println(member.toString());
			move(request);
			System.out.println("DEST IS " + InitCommand.cmd.getView());
			System.out.println("----------------MEMBER-C : CHANGE_PASS OUT---------------");
			DispatcherSevlet.send(request, response);
			break;
		case LEAVE_MEMBER:
			System.out.println("----------------MEMBER-C : LEAVE_MEMBER IN---------------");
			new DeleteCommand(request).execute();
			MemberServiceImpl.getInstance().nowIdDelete();
			session.invalidate(); //로그아웃시 정해진 메소드다.
			move(request);
			System.out.println("----------------MEMBER-C : LEAVE_MEMBER OUT---------------");
			break;
		case INSERT_MEMBER:
			System.out.println("----------------MEMBER-C : INSERT_MEMBER IN---------------");
			new InsertCommand(request).execute();
			MemberServiceImpl.getInstance().memberInfo();
			System.out.println("----------------MEMBER-C : INSERT_MEMBER OUT---------------");
			move(request);
			break;
		case LOGIN:
			System.out.println("----------------MEMBER-C : LOGIN IN---------------");
			new LoginCommand(request).execute();
			member = MemberServiceImpl.getInstance().login();
			if(member == null) {
				InitCommand.cmd.setDir("user");
				InitCommand.cmd.setPage("login");
			}else {
					System.out.println("=========== 로그인 성공 ===========");
					session.setAttribute("user", member);
					mypage(request);
					InitCommand.cmd.setDir("bitcamp");
					InitCommand.cmd.setPage("main");
			}
			move(request);
			System.out.println("DEST IS " +InitCommand.cmd.getView());
			System.out.println("----------------MEMBER-C:  LOGIN OUT---------------");
			DispatcherSevlet.send(request, response);break;
		case MYPAGE:
			mypage(request);
			break;
		case LOGOUT:
			break;
		default:
			break;
		}
	}
	
	private void move(HttpServletRequest request) {
		new MoveCommand(request).execute();
	}
	
	public void mypage(HttpServletRequest request)  {
		HttpSession session = request.getSession();
		MemberBean member = (MemberBean) session.getAttribute("user");
		//기본값은 무조건 있을 것이다. 그래서 null체크가 필요없다. 
		//but 추가되는 객체 account, phone 는 null 일 수 있다. 
		
		Object[] arr = {member.getAccount(), member.getMobile(), member.getFood(), member.getLotto()};        
		
		InitCommand.cmd.setData(member.getId());
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=null) {
				switch (i) {
				case 0:
					member =
					AccountServiceImpl.getInstance().findMobileById(member.getId());
					break;
				case 1:
					/*member = 
					MobileServiceImpl.getInstance().findMobileById(member.getId());
					break;*/
				case 2:
					
					break;
				case 3:
					
					break;
				default:
					break;
				}
				
			}		
		}
	}
}
		
		
		/*InitCommand.cmd.setData(member.getId());
		MemberBean memberWithAccount = KakaoServiceImpl.getInstance().findAccountById(member.getId());
		
		for( ) {}
		if(memberWithAccount == null) {
			System.out.println("계좌가 없는 멤버");
			session.setAttribute("user", member);
		}else {
			System.out.println("계좌가 있는 멤버");
			session.setAttribute("user", memberWithAccount);	
		}
		MemberBean memberWithMobile = MobileServiceImpl.getInstance().findMobileById(member.getId());
		
		if(memberWithAccount == null) {
			System.out.println("계좌가 없는 멤버");
			session.setAttribute("user", member);
		}else {
			System.out.println("계좌가 있는 멤버");
			session.setAttribute("user", memberWithAccount);	
	}*/
	




/*new LoginCommand(request).execute();
			MemberBean param = MemberServiceImpl.getInstance().login();
			if(param==null) {
				System.out.println("로그인 실패");
				InitCommand.cmd.setDir("user");
				InitCommand.cmd.setPage("login");
			}else {
				System.out.println("로그인 성공");
				session.setAttribute("user", param);
				InitCommand.cmd.setDir("bitcamp");
				InitCommand.cmd.setPage("main");
			}*/