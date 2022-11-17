package Data;
import java.sql.*;

public class DataBase {
	private Connection conn;
	private static final String uname = "root";
	private static final String pasword = "1234";
	private static final String url = "jdbc:mysql://localhost:3305/user";
//	private static final String url = "jdbc:mysql://localhost:3305/admin";
	
	public DataBase() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, uname, pasword);
			System.out.println("드라이버 로딩 성공");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		}
		
	}
	
	public static void main(String[] args) {
		new DataBase();
	}
	
	
}
