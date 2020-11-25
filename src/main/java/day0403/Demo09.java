package day0403;

import java.util.Scanner;

public class Demo09 {
	public static void main(String[] args) {
		/*
		 * 从键盘接收三个整数，按照从小到大的顺序输出
		 * */
		System.out.println("请输入数：");
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
		int a=scanner.nextInt();
		System.out.println("请输入数：");
		int b=scanner.nextInt();
		System.out.println("请输入数：");
		int c=scanner.nextInt();
		//a<b
		if(a<=b)
		{
			//b<c
			if (b<=c) {
				//abc
				System.out.println("从小到大的排列为："+a+","+b+","+c);
			}else if (a<=c) {
				//acb
				System.out.println("从小到大的排列为："+a+","+c+","+b);
			}else {
				//cab
				System.out.println("从小到大的排列为："+c+","+a+","+b);
			}
			//b<a<c
		}else  {
			if (a<=c) {
				//bac
				System.out.println("从小到大的排列为："+b+","+a+","+c);
			}else if (b<=c) {//b<c<a 
				System.out.println("从小到大的排列为："+b+","+c+","+a);
			}else {//c<b<a
				System.out.println("从小到大的排列为："+c+","+b+","+a);
			}
			
		}
		
	}

}
