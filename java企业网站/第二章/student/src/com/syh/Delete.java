package com.syh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		Connection conn=null;
		Statement st=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "admin");
			
			st=conn.createStatement();
			int n=st.executeUpdate("delete from grade where gradeid=7");
			if (n>0) {
				System.out.println("ɾ���ɹ�");
			} else {
				System.out.println("ɾ��ʧ��");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
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
