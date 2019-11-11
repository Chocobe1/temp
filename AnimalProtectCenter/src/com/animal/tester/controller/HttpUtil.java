package com.animal.tester.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpUtil {
	public static void forward(HttpServletRequest req, HttpServletResponse resp, String path) {
		try {		
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			dispatcher.forward(req, resp);
			
		} catch(ServletException e) {
			System.out.println("HttpUtil forward() 에러 : " + e.getMessage());
			
		} catch(IOException e) {
			System.out.println("HttpUtil forward() 에러 : " + e.getMessage());
		}
	}
}
