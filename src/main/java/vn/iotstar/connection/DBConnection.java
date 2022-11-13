package vn.iotstar.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private final String serverName = "CONG27042002";
	private final String dbName = "ShopOnline";
	private final String portNumber = "1433";
	private final String instance = "";
	// MSSQLSERVER LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
	private final String userID = "";
	private final String password = "";

	public Connection getConnectionW() throws Exception {
		String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + "\\" + instance + ";databaseName=" + dbName;
		if (instance == null || instance.trim().isEmpty())
			url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url, userID, password);
	}

	String dbURL = "jdbc:sqlserver://localhost\\sqlexpress;user=sa;password=secret";

	public static void main(String[] args) {
		try {
			System.out.println(new DBConnection().getConnectionW());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
