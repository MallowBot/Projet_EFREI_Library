package Projet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	private Connection conn = null;

	public void initConnection() {
		if (conn != null)
			return;

		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/lms?user=root&password=root&allowPublicKeyRetrieval=true&useSSL=false");
			System.out.println("Connection successful");

		} catch (SQLException e) {
			System.out.printf("SQLException: %s \nSQLState: %s\nVendor Error: %s\n", e.getMessage(), e.getSQLState(),
					e.getErrorCode());
		}
	}

	public ResultSet executeQuery(String sql) throws SQLException {
		Statement statement = this.conn.createStatement();
		return statement.executeQuery(sql);
	}
	
	public PreparedStatement createPreparedStatement(String sql) throws SQLException {
		return this.conn.prepareStatement(sql);
	}
	
	//TEST
	//test2
	
}
