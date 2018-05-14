package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class ScrollDemo
{
	public static void main(String[] args) 
	{
		Connection con;
		Statement st;
		ResultSet rs;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connecting to database");
			con = DriverManager.getConnection("jdbc:mysql://192.168.252.76:3306/mysqljdbc","root","12345");
			st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs= st.executeQuery("select *  from candidates");
			
			rs.afterLast();
			while(rs.previous()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getString(5)+" "+rs.getString(6));	
			}
			
			rs.absolute(3);
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getString(5)+" "+rs.getString(6));
			
			rs.relative(-1);
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getString(5)+" "+rs.getString(6));
			
			int i = rs.getRow();
			System.out.println("Cursor pos: "+i);
			
			rs.close();
			st.close();
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}