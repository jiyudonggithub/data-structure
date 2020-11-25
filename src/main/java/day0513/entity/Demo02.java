package day0513.entity;
import java.util.List;
import java.util.Scanner;
import day0513.dao.UaerDaoImpal;
@SuppressWarnings("all")
public class Demo02 {
	static UaerDaoImpal ud = new UaerDaoImpal();
	public static void main(String[] args) {
		//sign();
		//loon();
		likeFind(null);
	}
	public static void sign() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入用户名");
		String name = scanner.nextLine();
		while (ud.exisetUserName(name)) {
			System.out.println("用户名已存在，请重新输入:");
			name = scanner.nextLine();
		}
		System.out.println("输入密码");
		String passward = scanner.nextLine();
		System.out.println("输入年龄");
		int age = scanner.nextInt();
		System.out.println("输入工资");
		double salary = scanner.nextDouble();
		System.out.println("输入性别:0女生1男生");
		int gender = scanner.nextInt();
		User user = new User(null, name, passward, salary, gender, age);
		ud.add(user);
	}
	public static void loon() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入用户名");
		String name = scanner.nextLine();
		System.out.println("输入密码");
		String passward = scanner.nextLine();
		while (!ud.exisetUserName(name)) {
			System.out.println("用户名输入错误，请重新输入:");
			name = scanner.nextLine();
		}
		while (!ud.isexistPssward(name, passward)) {
			System.out.println("密码输入错误，请重新输入:");
		     passward = scanner.nextLine();
		}
		System.out.println("登录成功");
		
	}
	public static void likeFind(String name) {
		List<User> findAll = ud.findAll(name);
		for (User user : findAll) {
			System.out.println(user);
		}
	}

}
