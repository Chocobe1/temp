package com.animal.controller;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public class MemberLogOutController implements SubController {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) 
					throws ServletException, IOException {
		ServletContext context = req.getServletContext();
		String url = context.getContextPath() + "/view/memberView/index.jsp";
		
		req.getSession().removeAttribute("memberLogIn");
		
		resp.sendRedirect(url);
	}
}
