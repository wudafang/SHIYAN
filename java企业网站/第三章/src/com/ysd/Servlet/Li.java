package com.ysd.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Li extends HttpServlet {
String v=" ";
@Override
	public void init() throws ServletException {
		ServletContext sc=this.getServletContext();
		v=sc.getInitParameter("Test");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("ValueµÄÖµÊÇ£º"+v);
		
		out.flush();
		out.close();
	}

}
