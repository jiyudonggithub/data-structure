package day0507.test;

import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
@SuppressWarnings("all")
public class Demo01 {
	public static void main(String[] args) throws Exception {
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\emplist.obj"));
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\emplist.obj"));
		EmpList empList = new EmpList("locy", "girl", 18);
		EmpList empList1 = new EmpList("sice", "girl", 17);
		EmpList empList2 = new EmpList("kaokao", "boy", 19);
		EmpList empList3 = new EmpList("jun", "girl", 18);
		

		List<EmpList> list =new ArrayList<EmpList>();
		list.add(empList);
		list.add(empList1);
		list.add(empList2);
		list.add(empList3);
		
//		oos.writeObject(list);
//		oos.close();
		System.out.println("=========");
		List<EmpList> list2 = (ArrayList<EmpList>) ois.readObject();
		ois.close();
		System.out.println(list2);
		
		
	}
	
}
