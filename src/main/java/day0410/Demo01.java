package day0410;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 对象的属性的访问 对象名.属性名
		 */
		Student[] student = new Student[5];
		Student student1 = new Student();
		Student temp = new Student();
		student1.name = "季于东";
		Student.tName = "李帅";
		student1.adress = "安徽宿州";
		student1.score = 99;
		student1.age = 18;
		student1.hobby = new String[] { "电子", "看电影", "旅行" };
		student[0] = student1;
		Student student2 = new Student();
		student2.name = "王飘飘";
		student2.adress = "安徽滁州";
		student2.score = 100;
		student2.age = 18;
		student2.hobby = new String[] { "跳舞", "画画", "旅行" };
		student[1] = student2;

		Student student3 = new Student();
		student3.name = "何磊";
		student3.adress = "安徽合肥";
		student3.score = 97;
		student3.age = 18;
		student3.hobby = new String[] { "JAVA", "滑冰", "旅行" };
		student[2] = student3;

		Student student4 = new Student();
		student4.name = "王强";
		student4.adress = "安徽六安";
		student4.score = 96;
		student4.age = 18;
		student4.hobby = new String[] { "JAVA", "滑冰", "旅行" };
		student[3] = student4;

		Student student5 = new Student();
		student5.name = "涂亮亮";
		student5.adress = "安徽安庆";
		student5.score = 95;
		student5.age = 18;
		student5.hobby = new String[] { "JAVA", "滑冰", "旅行" };
		student[4] = student5;

		for (int i = 0; i < student.length - 1; i++) {
			for (int j = 0; j < student.length - i - 1; j++) {
				if (student[j].score > student[j + 1].score) {
					temp = student[j];
					student[j] = student[j + 1];
					student[j + 1] = temp;
				}
			}

		}
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].name);
		}

	}

}
