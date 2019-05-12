package com.ysd.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ZhangServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	if (req.getMethod().equals("GET")) {
		out.println("这是一个Get方法");
	}
	if (req.getMethod().equals("POST")) {
		out.println("这是一个Post方法");
	}
	out.flush();
	out.close();
	}
}
