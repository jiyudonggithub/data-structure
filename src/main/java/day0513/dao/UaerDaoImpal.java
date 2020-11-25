package day0513.dao;

import day0513.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UaerDaoImpal implements UserDao {
    public void add(User user) {
        Connection connection = null;
        PreparedStatement pstatement = null;
        try {
            connection = MyDBuUtil.getConnection();
            String sql = "insert into user  valuses(null,  ? ,  ? , ? , ? ,? )";
            pstatement = connection.prepareStatement(sql);
            String name = user.getName();
            String passward = user.getPassword();
            Integer age = user.getAge();
            Double salary = user.getSalary();
            Integer gender = user.getGender();
            pstatement.setString(1, name);
            pstatement.setString(2, passward);
            pstatement.setInt(3, age);
            pstatement.setDouble(4, salary);
            pstatement.setInt(5, gender);
            pstatement.executeUpdate(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            MyDBuUtil.classAll(pstatement, connection);
        }
    }

    public boolean exisetUserName(String name) {
        boolean flage = false;
        Connection connection = null;
        PreparedStatement pstatement = null;
        ResultSet rset = null;
        try {
            connection = MyDBuUtil.getConnection();
            String sql = "select * from user where name = ?";
            pstatement = connection.prepareStatement(sql);
            pstatement.setString(1, name);
            rset = pstatement.executeQuery();
            flage = rset.next();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            MyDBuUtil.classAll(rset, pstatement, connection);
        }
        return flage;
    }

    public boolean isexistPssward(String name, String passward) {
        boolean flage = false;
        Connection connection = null;
        PreparedStatement pstatement = null;
        ResultSet rset = null;
        try {
            connection = MyDBuUtil.getConnection();
            String sql = "select * from user where name = ? AND passward = ? ";
            pstatement = connection.prepareStatement(sql);
            pstatement.setString(1, name);
            pstatement.setString(2, passward);
            rset = pstatement.executeQuery();
            flage = rset.next();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            MyDBuUtil.classAll(rset, pstatement, connection);
        }
        return flage;
    }

    public List<User> findAll(String name) {
        List<User> list = new ArrayList<User>();
        Connection connection = MyDBuUtil.getConnection();
        String sql = "select * from user where name like?";
        PreparedStatement pstatement = null;
        ResultSet rset = null;
        try {
            pstatement = connection.prepareStatement(sql);
            name = name == null ? "" : name;
            pstatement.setString(1, "%" + name + "%");
            rset = pstatement.executeQuery();
            while (rset.next()) {
                int id = rset.getInt("id");
                String username = rset.getString("name");
                String passward = rset.getString("passward");
                int age = rset.getInt("age");
                double salary = rset.getDouble("salary");
                int gender = rset.getInt("gender");
                User user = new User(id, username, passward, salary, gender, age);
                list.add(user);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }
}
