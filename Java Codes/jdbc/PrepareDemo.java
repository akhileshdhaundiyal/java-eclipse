package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PrepareDemo {
	public static void main(String[] args) {
		Connection con;
		PreparedStatement st;
		String s;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connecting to database");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc", "root", "");
			s = "update candidates set last_name = ? where id = ?";
			st = con.prepareStatement(s);

			Scanner sc = new Scanner(System.in);
			System.out.print("Emp id: ");
			int empid = sc.nextInt();
			System.out.print("Last name: ");
			String nm = sc.next();

			st.setString(1, nm);
			st.setInt(2, empid);
			int rowAf = st.executeUpdate();
			System.out.println("Rows affected: " + rowAf);

			nm = "Yadav";
			empid = 2;
			st.setString(1, nm);
			st.setInt(2, empid);
			rowAf = st.executeUpdate();
			System.out.println("Rows affected: " + rowAf);
			sc.close();
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}