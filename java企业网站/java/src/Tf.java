import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Tf {
public static void main(String[] args) {
	Statement st=null;
	ResultSet rs=null;
	Connection conn=DBManager.getConnection();
	try {
		 st=conn.createStatement();
		 rs=st.executeQuery("select bname, tid from bookinfo");
		while(rs.next()){
			System.out.println("ÐÕÃû£¬"+rs.getString(1)+"±àºÅ"+rs.getString(2));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally{
	DBManager.closeAll(conn, st,rs);
}
}

}
