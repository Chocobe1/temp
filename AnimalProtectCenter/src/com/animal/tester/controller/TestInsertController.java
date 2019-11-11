package com.animal.tester.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.animal.controller.SubController;
import com.animal.tester.service.TestService;
import com.animal.tester.vo.TestVO;

public class TestInsertController implements SubController {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) 
					throws ServletException, IOException {
		String id = req.getParameter("id");
		String pw = req.getParameter("password");
		String path = null;
		
		TestVO vo = new TestVO();
		vo.setId(id);
		vo.setPassword(pw);
		
		TestService service = TestService.getInstance();
		String resultID = service.insert(vo);
		
		TestVO result = service.select(id);
		if(result.getId().equals(id)) {
			req.setAttribute("id", result.getId());
			path = "/jspTester/testInsertResult.jsp";
			
		} else {
			req.setAttribute("result", "서버문제에 의해 회원가입이 실패하였습니다");
		}
		
		HttpUtil.forward(req, resp, path);
	}
}
