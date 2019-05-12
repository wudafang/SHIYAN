import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Test{
	public static void main(String[] args){
		Connection conn=null;
		 Statement s=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root","admin");
             s=conn.createStatement();
           int  n=s.executeUpdate("insert into bookinfo value(null, '三', '罗中', '120', '120', '5', '1', '1', '三楼四排009列', '适合人群14~40岁人群');");
            if(n>0){
            	System.out.println("成功");
            }else{
            	System.out.println("再试一次");
            }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(s!=null){
					s.close();
				}if(conn!=null){
					conn.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
	
	}

}
