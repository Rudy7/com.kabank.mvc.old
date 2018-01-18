package com.kabank.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kabank.mvc.enums.PathEnum;
import com.kabank.mvc.service.AdminService;
import com.kabank.mvc.serviceImpl.AdminServiceImpl;
		
			/*"/admin.do"  /admin/openAccount.do */ 
@WebServlet({"/admin/main.do","/admin/create_form.do","/admin/create_table.do"})
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("====================관리자 컨트롤로 진입 후================");
		AdminService service;
		String servletPath = request.getServletPath();
		String[] arr = servletPath.split(PathEnum.SEPARATOR.value);
		String dir = arr[1];
		String[] arr2 = arr[2].split(PathEnum.DOT.value);
		String action = arr2[0];
		String dest ="";
		switch (action) {
		case "main":
			dir = "admin";
			dest = action; 
			break;
		case "create_form":
			System.out.println("생성 클릭 2");
			String tname = request.getParameter("table_name");
			service = new AdminServiceImpl();
			service.createTable(tname);
			dir = "admin";
			dest = "main";
			break;
		case "create_table":
			dir = "admin";
			dest = "member_list";
			break;
		
		default:
			break;
		}
		RequestDispatcher rd = request.getRequestDispatcher(PathEnum.VIEW.value +dir+ 
				PathEnum.SEPARATOR.value +dest+ 
				PathEnum.EXTENSION.value);
		rd.forward(request, response);		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}

