package day0507.entity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
@SuppressWarnings("all")
public class Demo07 {
	public static void main(String[] args) throws Exception {
		System.out.println("请选择输入的功能：1: 注册   2: 登录  3: 退出");
		Scanner scanner = new Scanner(System.in);
		File file = new File("f:\\emp.txt");
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("f:\\emp.txt", true));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f:\\map.obj",true));
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f:\\map.obj"));
		BufferedWriter bw = new BufferedWriter(osw);
//		InputStreamReader isr = new InputStreamReader(new FileInputStream("f:\\emp.txt"));
//		BufferedReader br = new BufferedReader(isr);
//		HashSet<String> set = new HashSet<String>();
		HashMap<String, String> map = new HashMap<String, String>();
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1: {
					System.out.println("请输入用户名:");
					String name = scanner.next();
					if (file.length() > 0) {
						HashMap<String, String> maps = ( HashMap<String, String> ) ois.readObject();
						Set<String> keySet = maps.keySet();
						while (keySet.contains(name)) {
							System.out.println("您刚刚输入的用户名已经存在，请重新输入");
							name = scanner.next();
						}
					}
					System.out.println("请输入密码:");
					String password = scanner.next();
					map.put(name, password);
					bw.write(name + "==" + password);
					bw.newLine();
					bw.flush();
					oos.writeObject(map);
					bw.close();
					oos.close();
					ois.close();
					System.out.println("注册成功");
		}
			break;
		case 2:{
					System.out.println("请输入用户名:");
					String name = scanner.next();
					HashMap<String, String> maps = ( HashMap<String, String> ) ois.readObject();
					while (!maps.containsKey(name)) {
						System.out.println("用户名输入错误请重新输入:");
						name = scanner.next();
					}
					System.out.println("请输入密码:");
					String password = scanner.next();
					while (!maps.get(name).equals(password)) {
						System.out.println("密码输入错误请重新输入:");
						password = scanner.next();
					}
					ois.close();
					System.out.println("登陆成功");
			
		}
			break;
		default:{
			
			System.out.println("退出");	
		}
			break;
		}
	}

}
