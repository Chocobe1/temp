package com.animal.tester.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.animal.controller.SubController;
import com.animal.tester.service.TestService;
import com.animal.tester.vo.TestVO;

public class TestDeleteController implements SubController {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) 
					throws ServletException, IOException {
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		String path = "/jspTester/testDeleteResult.jsp";
		
		TestVO vo = new TestVO();
		vo.setId(id);
		vo.setPassword(password);
		
		TestService service = TestService.getInstance();
		service.delete(vo);
		
		HttpUtil.forward(req, resp, path);
	}
}
