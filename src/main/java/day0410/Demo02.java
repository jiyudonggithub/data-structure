package day0410;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Mouse mouse =new Mouse();
		mouse.colour = "黑";
		mouse.kind = "华为";
		mouse.respond = 8;
		mouse.useAge = 5;
		mouse.cherr = 132;
		System.out.println(mouse.toString());
		dog.name = "中华神犬";
		dog.kind = "藏獒";
		dog.age = 2;
		dog.master = "徐世清";
		dog.adress = "北京后海";
		dog.colur = "黑";
		dog.print();
		
		

	}

}
