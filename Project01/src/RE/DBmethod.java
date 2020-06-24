package RE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBmethod { //커넥션 getConnection() & 클로즈close()

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	public void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@172.30.1.56:1521:xe";
			String db_id = "psh";
			String db_pw = "psh";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("연결실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연결실패");
		}
	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
