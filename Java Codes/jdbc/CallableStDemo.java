package jdbc;
import java.sql.*;

public class CallableStDemo
{
	Connection con;
	CallableStatement st;		
	String s;
	ResultSet rs;
	
	CallableStDemo(){}
	
	void createCon()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connecting to database");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","");
		}
		catch(Exception e)
			{System.out.println(e);}
	}
	
	public void getSkills(int cid)
	{
		try
		{
			s = "{ call get_candidate_skill(?) }";
			st = con.prepareCall(s);
			st.setInt(1, cid);
			rs = st.executeQuery();
			
			while(rs.next())
				System.out.println( String.format("%s - %s", rs.getString("first_name")+ " "+ rs.getString("last_name"), rs.getString("skill")) );
		}
		catch(Exception e)
			{System.out.println(e);}
	}
	
	public static void main(String[] args) 
	{		
		CallableStDemo obj = new CallableStDemo();
		obj.createCon();
		obj.getSkills(133);
	}
}