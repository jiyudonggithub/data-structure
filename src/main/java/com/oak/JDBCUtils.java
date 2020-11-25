package com.oak;

import lombok.val;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author 季于东
 * @date 2019/9/21
 */
public class JDBCUtils {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    static {
        //读取配置文件中的信息
        try {
            Properties pt = new Properties();
            val filePath = JDBCUtils.class.getClassLoader()
                    .getResource("dbb.properties").openStream();
            pt.load(filePath);
            url = pt.getProperty("jdbc.url");
            user = pt.getProperty("jdbc.username");
            password = pt.getProperty("jdbc.password");
            driver = pt.getProperty("jdbc.driver");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Class.forName("jdbc.driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(url, user, password);
    }

    public static void close(Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet res, Statement stmt, Connection conn) {
        close(stmt, conn);
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
