package day0411.entity;

public class People {
	
	public String name;
	public Computer pc;
	public String aderss;
	public String sex;
	public byte age;
    
	@Override
	public String toString() {
		return "People [name=" + name + ", pc=" + pc + ", aderss=" + aderss + ", sex=" + sex + ", age=" + age + "]";
	}

}
