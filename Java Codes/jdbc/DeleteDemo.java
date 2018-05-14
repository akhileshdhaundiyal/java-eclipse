package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class DeleteDemo
{
	public static void main(String[] args) 
	{
		Connection con;
		Statement st;		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connecting to database");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","");
			st=con.createStatement();			
			
			String sql = "Delete from candidates where rtrim(last_name) like\'Young\';";
			int cnt = st.executeUpdate(sql); 
			
			if(cnt>0)
				System.out.println("Record for Young deleted");					
			
			st.close();
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}