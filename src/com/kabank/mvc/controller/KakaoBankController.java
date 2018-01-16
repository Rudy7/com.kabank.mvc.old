package com.kabank.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kabank.mvc.service.AdminService;
import com.kabank.mvc.serviceImpl.AdminServiceImpl;

@WebServlet("/a.do")
public class KakaoBankController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
	/*	System.out.println("====================KAKAO BANK-C : doGet IN================");
		AdminService service = new AdminServiceImpl();
		String tname = request.getParameter("kakao_tname");
		service.kakaoCreateTable(tname);
		System.out.println("doGet tname :" + tname);
		dest = "main";
		System.out.println("====================KAKAO BANK-C : doGet OUT================");*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
