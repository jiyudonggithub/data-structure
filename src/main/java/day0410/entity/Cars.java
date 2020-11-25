package day0410.entity;

public class Cars {
	public String brand;
	public String colour;
	public int num;

	/**
	 * 
	 * @param cmd
	 *            所传的命令 0为向前移动 1为向后移动
	 * @param x
	 *            所移动的距离
	 */
	public void move(int cmd, int x) {
		switch (cmd) {
		case 0:
			System.out.println("向前移动" + x + "米");
			break;
		case 1:
			System.out.println("向后移动" + x + "米");
			break;

		default:
			System.out.println("输入命令不符合");
			break;
		}

	}

	public void chargeAnOpponent() {
		System.out.println("汽车失控撞到行人");
	}

	public void showMe() {
		System.out.println("我是" + brand + "汽车，我的颜色是" + colour + "我有" + num + "个轮子");

	}

}
