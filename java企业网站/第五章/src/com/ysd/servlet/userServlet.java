package com.ysd.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ysd.entity.User;

public class userServlet extends HttpServlet {



	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		
 List<User> list=new ArrayList<User>();
 list.add(new User(100,"张三", "跑步"));
 list.add(new User(101,"张四", "跑步"));
 list.add(new User(102,"张无", "跑步"));
 list.add(new User(103,"张里", "跑步"));
 request.setAttribute("list", list);
 request.getRequestDispatcher("user.jsp").forward(request, response);
	
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	doGet(request, response);
	}

}
