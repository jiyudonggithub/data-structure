package day0403;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		
			int  num =  (int)( Math.random()*10+1);
			System.out.println("请输入您猜测的数（1~10），输入0退出");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			  int guest = scanner.nextInt();
			  int score = 10;
			  while (guest != num)
			  {
				  if (guest == 0) {
					  score = 0;
					System.out.println("选手弃权，分数为:"+score);
					break;
				} else if (guest > num) {
					System.out.println("猜大了,请重新输入");
				} else {
					System.out.println("猜小了，请重新输入");
					
				}guest = scanner.nextInt();
				score--;
			  }
			  if(guest == num)System.out.println("恭喜你猜对了,分数为:"+score);
	 			
	}

}
