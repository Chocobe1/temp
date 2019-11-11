package com.animal.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private Map<String, SubController> controllers;
	
	
	@Override
	public void init(ServletConfig config) {
		@SuppressWarnings("unchecked")
		Map<String, SubController> initControllers = 
						(Map<String, SubController>)config.getServletContext().getAttribute("controllers");
		
		controllers = initControllers;
	}
	
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) 
					throws ServletException, IOException {
		String uri = req.getRequestURI();
		String contextPath = req.getContextPath();
		String path = uri.substring(contextPath.length());
		
		SubController subController = controllers.get(path);
		subController.execute(req, resp);
	}
}
