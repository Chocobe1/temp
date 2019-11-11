package com.animal.tester.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.animal.controller.SubController;
import com.animal.tester.vo.TestVO;

public class TestUpdateController implements SubController {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) 
					throws ServletException, IOException {
		String id = req.getParameter("id");
		String pw = req.getParameter("password");
		String path = "";
		
		TestVO vo = new TestVO();
		
	}
}
