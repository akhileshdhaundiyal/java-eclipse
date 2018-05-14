package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseMetaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		Statement st;
		java.sql.DatabaseMetaData dmd;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connecting to database");
			con = DriverManager.getConnection("jdbc:mysql://192.168.252.76:3306/mysqljdbc","root","12345");
			st = con.createStatement();
			dmd = con.getMetaData();
			System.out.println("db server name: " + dmd.getDatabaseProductName());
			System.out.println("db server version: " + dmd.getDatabaseProductVersion());
			System.out.println("db server version: " + dmd.getDriverVersion());
			System.out.println("db server name: " + dmd.getDriverName());
			System.out.println("max columns: " + dmd.getMaxColumnsInTable());
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
