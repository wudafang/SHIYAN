package com.syh;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class slelect {
	public static void main(String[] args) {
	Statement  st=null; 
	ResultSet re=null;
	Connection conn=DBManager.getConnection();
	try {
		st=conn.createStatement();
	    re=st.executeQuery("select studentid,studentname,gender,age from studentinfo where gender='��'");
		while(re.next()){
			System.out.println("ѧ�ţ�"+re.getString(1)+"��������"+re.getString(2)+"���Ա�"+re.getString(3)+"����ͣ�"+re.getInt(4));
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		DBManager.closeAll(conn, st, re);
	}
	}
}
