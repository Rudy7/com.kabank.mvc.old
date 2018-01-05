package com.kabank.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kabank.mvc.service.AdminService;
import com.kabank.mvc.serviceImpl.AdminServiceImpl;

@WebServlet({"/admin/main.do","/admin/create_table.do"})
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("====================관리자 컨트롤로 진입================");
		String servletPath = request.getServletPath();
		String[] arr = servletPath.split("/");
		String dir = arr[1];
		String[] arr2 = arr[2].split("\\.");
		String action = arr2[0];
		String dest ="";
		switch (action) {
		case "main":
			dest = action; 
			break;
		case "create_table":
			String tname = request.getParameter("table_name");
			AdminService service = new AdminServiceImpl();
			service.makeTable(tname);
			dest = "main";
			break;
		default:
			break;
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/" + dir + "/" + action + ".jsp" );
		rd.forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
	
}

