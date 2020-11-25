package studentDB.test;

import java.util.ArrayList;
import java.util.List;

import studentDB.dao.StudentDao;
import studentDB.dao.StudentDaoImpl;
import studentDB.entity.Student;

public class StuTest1 {

	public static void main(String[] args) {
		StudentDao sd = new StudentDaoImpl();
		Student stu = new Student();
		//stu.setId(4);
		stu.setName("紫萱");
		stu.setPassword("bbf");
		stu.setTel("7857898472");
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(4);
		stu.setHobby(list);
		sd.addStu(stu);
//		sd.deleteStu(3);
//		sd.modifyStu(stu);
		System.out.println("执行完毕");
	}

}
