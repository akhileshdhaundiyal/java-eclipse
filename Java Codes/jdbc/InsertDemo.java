package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class InsertDemo 
{
	public static void main(String[] args) 
	{ 
		Connection con;
		Statement st;
		ResultSet rs;
		int cnt=0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connecting to database");
			con = DriverManager.getConnection("jdbc:mysql://192.168.252.76:3306/mysqljdbc","root","12345");
			
			String str="Insert Into skills(name)"+"values('uml')";
			
			st=con.createStatement();
			int rowcount= st.executeUpdate(str);
			if(rowcount>0){ System.out.println("record inserted successfully");}
			
			String str1 = "select count(id) from skills";
			rs=st.executeQuery(str1);
			while(rs.next()){ cnt=rs.getInt(1);}
			System.out.println("total no of records is :"+cnt);
			
			rs.close();
			st.close();
			con.close();
		}catch(Exception e){
			System.out.println(e);}
	}
}
