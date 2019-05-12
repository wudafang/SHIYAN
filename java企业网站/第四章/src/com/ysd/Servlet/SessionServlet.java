package com.ysd.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		String sessionid=session.getId();
		if (session.isNew()) {
			out.println("session创建成功，session的id是：" + sessionid);
		}else{
			out.println("session已经存在。id为"+sessionid);
		}
		//NullPointerException
		//ClassCastException   int cannot be cast to string
		//ClassNotFoundException 
		
		Cookie[] cookie=request.getCookies();
		if (cookie!=null) {
			for (int i = 0; i < cookie.length; i++) {
				out.println("键为"+cookie[i].getName());
				out.println("值为"+cookie[i].getValue());
			}
		} else {
			out.println("没有cookie");
		}
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
