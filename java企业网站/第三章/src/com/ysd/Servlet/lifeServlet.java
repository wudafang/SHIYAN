package com.ysd.Servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class lifeServlet extends HttpServlet {
public lifeServlet(){
	System.out.println("���Ǳ�ʵ������");
}


@Override
	public void init() throws ServletException {
	System.out.println("���Ǳ���ʼ����");
	}

@Override
	protected void service(HttpServletRequest req, HttpServletResponse res){
System.out.println("���Ǳ�������");
	}

@Override
	public void destroy() {
	System.out.println("���Ǳ�������");
	}
}
         

    
