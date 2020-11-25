package day0513.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo01 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day0511", "root", "root");
//		String  sql = "INSERT INTO `user` VALUES(null,'杨幂',33,5600,'女'),(null,'王凯',33,5600,'男');";
//		String  sql = "update user  set age = age +3 where name = '杨幂'";
		String  sql = "select * from user";
		Statement createStatement = connection.createStatement();
//		createStatement.executeUpdate(sql);
		ResultSet resultSet = createStatement.executeQuery(sql);
		while (resultSet.next()) {
			 int id = resultSet.getInt("id");
			 String name = resultSet.getString("name");
			 int age = resultSet.getInt("age");
			 double salary = resultSet.getDouble("salary");
			 String gender = resultSet.getString("gender");
			 System.out.print(id+"\t");
			 System.out.print(name+"\t");
			 System.out.print(age+"\t");
			 System.out.print(salary+"\t");
			 System.out.print(gender+"\r\n");
		}
		resultSet.close();
		createStatement.close();
		connection.close();
		System.out.println("执行结束");
	}

}
