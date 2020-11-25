package studentDB.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 * jdbc连接mysql工具类
 *
 * @author 李帅
 */
public class MyDBUtil {
    /**
     * 获取连接
     *
     * @return
     */
    public static Connection getConn() {
        Connection connection = null;
        // 加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //读取配置文件中的信息
            ResourceBundle rb = ResourceBundle.getBundle("db");
            String url = rb.getString("jdbc.url");
            String username2 = rb.getString("jdbc.username");
            String password2 = rb.getString("jdbc.password");
            connection = DriverManager.getConnection(url, username2, password2);
            // 获取语句块
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 获取语句块
     *
     * @return
     */
    public static Statement getStatement(Connection conn) {
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return stmt;
    }

    /**
     * 关闭资源
     *
     * @param rs
     * @param stmt
     * @param connection
     */
    public static void closeAll(AutoCloseable... at) {
        for (AutoCloseable autoCloseable : at) {
            if (autoCloseable != null) {
                try {
                    autoCloseable.close();
                    autoCloseable = null;
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

}
