package main18;

//DBに接続してSQLを送信する
import java.sql.Connection;
import java.sql.DriverManager;

public class Main18_04 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.he.Driver");
		String dburl = "jdbc:h2:~/test";
		String sql = "INSERT INTO EMPLOYEES(name) VALUES('aoki')";
		Connection conn = DriverManager.getConnection(dburl);
		conn.createStatement().executeUpdate(sql);
		conn.close();
	}
}
