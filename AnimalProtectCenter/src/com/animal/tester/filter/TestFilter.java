package com.animal.tester.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testFilter")
public class TestFilter extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
					throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		out.print("<h1>📑 EncodingFilter 테스트 페이지</h1><hr/>");
		
		out.print("<h3>😎 한글 출력 테스트</h3>");
		out.print("<h3>😐 Test to output English</h3>");
		out.print("<h3>🤨 日本語のエンコーディングテスト</h3>");
		
		out.close();
	}
}
