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
			//���벢���� "com.mysql.jdbc.Driver" �̶�д��;
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","admin");
			//���� jdbc:mysql://localhost:3306/ �̶�д�� /��������ݿ�����+�û���+����;
			 st=conn.createStatement();
			int n=st.executeUpdate("insert grade value(8,'17��')");
			//���Ͳ����ؽ��
			if (n>0) {
				System.out.println("��ӳɹ�"); 
			} else {
				System.out.println("���ʧ��");
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
