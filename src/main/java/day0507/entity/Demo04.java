package day0507.entity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo04 {
	public static void main(String[] args) throws Exception, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:\\pp.obj"));
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:\\pp.obj"));
		Student s = new Student("kaokao", 18, "anhui");
		oos.writeObject(s);
		Object object = ois.readObject();
		 Student student = (Student) object;
		 oos.close();
		 ois.close();
		 System.out.println(student.getName());
	}

}
