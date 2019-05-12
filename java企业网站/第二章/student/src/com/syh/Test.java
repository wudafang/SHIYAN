package com.syh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) {
		Statement st=null;
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//导入并驱动 "com.mysql.jdbc.Driver" 固定写法;
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","admin");
			//连接 jdbc:mysql://localhost:3306/ 固定写法 /后面加数据库名，+用户名+密码;
			 st=conn.createStatement();
			int n=st.executeUpdate("insert grade value(8,'17级')");
			//发送并返回结果
			if (n>0) {
				System.out.println("添加成功"); 
			} else {
				System.out.println("添加失败");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if (st!=null) {
					st.close();
				}if (conn!=null) {
					conn.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
