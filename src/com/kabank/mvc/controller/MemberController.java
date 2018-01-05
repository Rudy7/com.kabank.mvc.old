package com.kabank.mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kabank.mvc.constants.Path;
import com.kabank.mvc.domain.MemberBean;
import com.kabank.mvc.service.MemberService;
import com.kabank.mvc.serviceImpl.MemberServiceImpl;

import oracle.sql.ARRAY;

@WebServlet({ "/user/login.do", "/user/join.do", "/user/auth.do" })
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("====================회원 컨트롤로 진입================");
		String servletPath = request.getServletPath();
		System.out.println("서블릿패스: " + servletPath);
		String[] arr = servletPath.split("/");
		String dir = arr[1];
		String[] arr2 = arr[2].split("\\.");
		String dest = arr2[0];
		if (dest.equals("auth")) {
			MemberService service = new MemberServiceImpl();
			MemberBean member = new MemberBean();
			System.out.println("아이디:" + request.getParameter("id"));
			System.out.println("비밀번호:" + request.getParameter("pass"));
			member.setId(request.getParameter("id"));
			member.setPass(request.getParameter("pass"));
			service.login(member);
			dir = "bitcamp";
			dest = "main";
		} else if (dest.equals("login")) {
			dir = "user";
			dest = "login";
		} else if (dest.equals("join")) {
			dir = "user";
			dest = "join";
		}
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/" + dir + "/" + dest + ".jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}

// "/user/auth.do"