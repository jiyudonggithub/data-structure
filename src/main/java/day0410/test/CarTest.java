package day0410.test;

import day0410.entity.Car;

public class CarTest {

	public static void main(String[] args) {
		Car[] car = new Car[10];
		String[] brands = { "大众", "别克", "丰田" };
		String[] colous = { "黑色", "白色", "灰色", "蓝色", "黄色", "红色" };
		//int index = 0;
		int a = 0;
		int b = 0;
		int c = 0;
//		while (index < 10) {
//			Car cars = new Car();
//			cars.brand = brands[(int) (Math.random() * brands.length)];
//			cars.colour = colous[(int) (Math.random() * colous.length)];
//			cars.price = ((int) (Math.random() * 6) + 5) * 10;
//			cars.weight = Math.random() * 1000;
////			if (index == 0) {
////				car[index++] = cars;
////				continue;
////			}
////			for (int i = 0; i < index; i++) {
////				if (cars.equals(car[i])) {
////					break;
////				} else if (i == index - 1) {
////					car[index++] = cars;
////				}
////			}
//		}
		for (int i = 0; i < car.length; i++) {
			Car cars = new Car();
			cars.brand = brands[(int) (Math.random() * brands.length)];
			cars.colour = colous[(int) (Math.random() * colous.length)];
			cars.price = ((int) (Math.random() * 6) + 5) * 10;
			cars.weight = Math.random() * 1000;
			if (isChongfu(car,cars,i)) {
				car[i] = cars;
			}else {
				i--;
			}
			
		}
		for (int i = 0; i < car.length; i++) {
			if (car[i].brand == brands[0]) {
				// 大众
				a++;
			} else if (car[i].brand == brands[1]) {
				// 别克
				b++;
			} else {
				// 丰田
				c++;
			}

		}
		System.out.print("大众汽车：" + a + "个" + "\t");
		System.out.print("别克汽车：" + b + "个" + "\t");
		System.out.println("丰田汽车：" + c + "个");

	}
	/**
	 * 判断temp是不是在arr数组中
	 * @param arr
	 * @param temp
	 * @return
	 */
	public static boolean isChongfu(Car[] car, Car temp,int a) {
		for (int i = 0; i < a; i++) {
			if (temp.equals(car[i])) {
				return false;
			}
		}
		return true;
	}

}
