package day0412.test;

import day0412.entity.People;
import day0412.entity.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People people = new People();
		people.age = 23;
		people.name = "张三";
		People people2 = new People("李四", 25);
		people.showInfo();
		people2.showInfo();
		Student student = new Student();
		student.sex = "男";
		System.out.println(student);
		Student student2 = new Student("李四", 18, "男");
		System.out.println(student2);

	}

}
