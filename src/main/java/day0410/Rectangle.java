package day0410;

public class Rectangle {
	int hight;
	int weight;

	/**
	 * 计算矩形的周长
	 * 
	 * @return
	 */
	public int perimeter() {
		return (hight + weight) * 2;
	}

	/**
	 * 计算矩形的面积
	 * 
	 * @return
	 */
	public int acreage() {
		return hight * weight;
	}

}
