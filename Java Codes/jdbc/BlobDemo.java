package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class BlobDemo {
	Connection con;
	Statement st;

	void createConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connecting to database");
			con = DriverManager.getConnection("jdbc:mysql://192.168.252.147:3306/mysqljdbc", "root", "Yahoo@321");
			st = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void writeBlob(int candidateId, String filename) {
		String updateSQL = "update candidates " + " set resume=? " + " where id=? ";
		try {
			PreparedStatement pst = con.prepareStatement(updateSQL);

			File file = new File(filename);
			FileInputStream input = new FileInputStream(file);

			pst.setBinaryStream(1, input);
			pst.setInt(2, candidateId);

			System.out.println("reading file : " + file.getAbsolutePath());
			System.out.println("Store file in the databse .");
			int rowCount = pst.executeUpdate();
			System.out.println("Row Count : " + rowCount);

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		BlobDemo bd1 = new BlobDemo();
		bd1.createConnection();
		bd1.writeBlob(1, "johndoe_resume.pdf");
	}

}
