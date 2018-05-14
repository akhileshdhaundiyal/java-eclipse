package jdbc;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class mySQLcon
{
	public static void main(String[] args) 
	{
		Connection con;
		Statement st;
		ResultSet rs;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connecting to database");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","akd","haha");
			st=con.createStatement();
			rs= st.executeQuery("select *  from candidates");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getString(5)+" "+rs.getString(6));	
			}
			rs.close();
			st.close();
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}