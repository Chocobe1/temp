package com.animal.tester.error;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testServletError")
public class TestServletError extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) 
					throws ServletException, IOException {
		String nullValue = (String)req.getAttribute("nullValue");
		nullValue.length();
	}
}
