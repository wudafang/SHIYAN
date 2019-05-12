package com.ysd.Servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class lifeServlet extends HttpServlet {
public lifeServlet(){
	System.out.println("这是被实例化了");
}


@Override
	public void init() throws ServletException {
	System.out.println("这是被初始化了");
	}

@Override
	protected void service(HttpServletRequest req, HttpServletResponse res){
System.out.println("这是被服务化了");
	}

@Override
	public void destroy() {
	System.out.println("这是被销毁了");
	}
}
         

    
