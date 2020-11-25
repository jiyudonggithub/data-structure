package day0416.test;

import day0416.entity.Student;

public class StudentTest {

	public static void main(String[] args) {

		final Student S = new Student(18);
		S.setAge(10);
		System.out.println(S.getAge());
		int m = 8;
		na(m);
		System.out.println(m);
		Student student = new Student(18);
		sd(student);
		System.out.println(student);
		shd(student);
		System.out.println(student);

	}

	public static void na(int i) {

		i = 5;
	}

	public static void sd(Student s) {

		s = new Student(20);
	}

	public static void shd(Student s) {

		s.setAge(25);

	}

}
