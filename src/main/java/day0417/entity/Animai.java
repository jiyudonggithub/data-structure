package day0417.entity;
/**
 * 定义一个动物类
 * 有性别，年龄，品质
 * @author jiyudong
 *
 */
public abstract class Animai {
	/**
	 * 性别
	 */
	public String sex;
	/**
	 * 年龄
	 */
	public int age;
	/**
	 * 品质
	 */
	public String brand;
	/**
	 * 吃东西
	 */
	public abstract void eat();
	/**
	 * 叫
	 */

	public abstract void bride();
	/**
	 * 有参构造
	 * @param sex
	 * @param age
	 * @param brand
	 */
	public Animai(String sex, int age, String brand) {
		super();
		this.sex = sex;
		this.age = age;
		this.brand = brand;
	}
	/**
	 * 无参构造
	 */
	public Animai() {
		super();
	}
	

}
