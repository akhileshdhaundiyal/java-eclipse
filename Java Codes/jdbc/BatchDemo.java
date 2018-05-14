package jdbc;
import java.sql.*;

public class BatchDemo
{
	public static void main(String[] args) 
	{
		Connection con = null;
		Statement st;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connecting to database");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","");
			st = con.createStatement();
			con.setAutoCommit(false);
			
			st.addBatch("insert into candidate_skills values(101,5)");
			st.addBatch("update skills set name='Ajax' where id=6");
			st.addBatch("delete from candidates where id=80");
			
			st.executeBatch();
			con.commit();
			System.out.println("Batch executed");
			
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			try
			{
				con.rollback();
				System.out.println("Batch failed: "+ e);
			}
			catch(Exception ee)
			{System.out.println(ee);}
		}
	}
}