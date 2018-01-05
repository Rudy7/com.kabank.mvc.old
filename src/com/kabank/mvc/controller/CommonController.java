package com.kabank.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.kabank.mvc.constants.Path;
import com.kabank.mvc.service.CommonService;
import com.kabank.mvc.serviceImpl.CommonServiceImpl;

@WebServlet("/common/jdbc_test.do")
public class CommonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CommonService service;
	public CommonController() {
		service = new CommonServiceImpl();
		}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String dir = request.getServletPath().split(Path.SEPARATOR)[1];
		String dest = request.getServletPath().split(Path.SEPARATOR)[2].split(Path.DOT)[0];
		CommonService service = new CommonServiceImpl();
		
		
		request.setAttribute("count", service.countTable());   //스트링값이라 ""해야한다. 
		request        /*/WEB-INF/view/ common       /      jdbc_test   .jsp  신기하다*/
		.getRequestDispatcher(Path.VIEW +dir+ Path.SEPARATOR +dest+ Path.EXTENSION)
		.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
