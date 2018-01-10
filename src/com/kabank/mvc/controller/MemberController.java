package com.kabank.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kabank.mvc.dao.MemberDAO;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.service.MemberService;
import com.kabank.mvc.serviceImpl.MemberServiceImpl;


@WebServlet({ "/user/login.do", "/user/join.do", "/user/auth.do", "/user/signup.do" })
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean member = new MemberBean();
		String dest = "";
		String servletPath = request.getServletPath();
		String[] arr = servletPath.split("/");
		String dir = arr[1];
		String[] arr2 = arr[2].split("\\.");
		String action = arr2[0];
		switch (action) {
		case "login":
			dir = "user";
			dest = action;
			break;
		case "join":
			dir = "user";
			dest = action;
			break;
		case "signup":
			service.joinMember(member);
			dir = "user";
			dest = "login"; 
			break;
		case "auth":
			service.findMemberById(member);
			dir = "bitcamp";
			dest = "main";
			break;
		default:
			break;
		}
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/" +dir+ "/" +dest+ ".jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	}
}

// "/user/auth.do"