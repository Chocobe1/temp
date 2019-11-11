package com.animal.tester.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.animal.controller.SubController;
import com.animal.tester.service.TestService;
import com.animal.tester.vo.TestVO;

public class TestSelectController implements SubController {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) 
					throws ServletException, IOException {
		String id = req.getParameter("id");
		String job = req.getParameter("job");
		String path = null;
		
		TestService service = TestService.getInstance();
		TestVO vo = service.select(id);
		
		if(vo == null) {
			req.setAttribute("result", "검색된 정보가 없습니다");
		}
		
		req.setAttribute("vo", vo);
		
		if(job.equals("select")) {
			path = "/jspTester/testSelectResult.jsp";
		}
		
		HttpUtil.forward(req, resp, path);
	}
}
