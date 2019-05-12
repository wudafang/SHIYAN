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
			out.println("session�����ɹ���session��id�ǣ�" + sessionid);
		}else{
			out.println("session�Ѿ����ڡ�idΪ"+sessionid);
		}
		//NullPointerException
		//ClassCastException   int cannot be cast to string
		//ClassNotFoundException 
		
		Cookie[] cookie=request.getCookies();
		if (cookie!=null) {
			for (int i = 0; i < cookie.length; i++) {
				out.println("��Ϊ"+cookie[i].getName());
				out.println("ֵΪ"+cookie[i].getValue());
			}
		} else {
			out.println("û��cookie");
		}
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
