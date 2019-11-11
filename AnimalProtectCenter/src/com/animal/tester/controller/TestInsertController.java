package com.animal.tester.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.animal.controller.SubController;

public class TestInsertController implements SubController {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) 
					throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("<h1>Test Insert Controller Page</h1>");
		
		out.close();
	}
}
