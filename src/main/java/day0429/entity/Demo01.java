package day0429.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Emp> emps = new ArrayList<Emp>();

        emps.add(new Emp("Smith", 23, 'm', 3000));
        emps.add(new Emp("Terry", 25, 'm', 6000));
        emps.add(new Emp("Allen", 21, 'f', 4000));
        System.out.println(emps);
//		Collections.sort(emps, new Comparator<Emp>() {
//			public int compare(Emp o1, Emp o2) {
//				// TODO Auto-generated method stub
//				return o2.getSalary() - o1.getSalary();
//			}
//		});
//     使用lambda 表达式
        Collections.sort(emps, (Emp o1, Emp o2) ->
                o2.getSalary() - o1.getSalary());
        System.out.println(emps);
    }

}
