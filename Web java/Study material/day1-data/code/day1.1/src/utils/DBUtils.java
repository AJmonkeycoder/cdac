package utils;

import java.sql.*;

public class DBUtils {
	private static Connection cn;

	// add a method to open n ret a FIXED db cn
	public static Connection openConnection() throws /* ClassNotFoundException, */ SQLException {
		// optional : load JDBC driver class
	//	Class.forName("com.mysql.cj.jdbc.Driver");
		cn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3000/advjava?useSSL=false&allowPublicKeyRetrieval=true", "root", "root");
		return cn;
	}

}