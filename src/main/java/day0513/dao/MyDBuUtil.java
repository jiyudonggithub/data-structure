package day0513.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class MyDBuUtil {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ResourceBundle rb =  ResourceBundle.getBundle("db");	
			String url = rb.getString("jdbc.url");
			String username = rb.getString("jdbc.uaername");
			String password = rb.getString("jdbc.password");
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public static void classAll(Statement statm, Connection connection) {
		try {
			if (statm != null) {
				statm.close();
				statm = null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (connection != null) {
				connection.close();
				connection = null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void classAll(ResultSet rset, Statement statm, Connection connection) {
		try {
			if (rset != null) {
				rset.close();
				rset = null;
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		MyDBuUtil.classAll(statm, connection);
	}

}
