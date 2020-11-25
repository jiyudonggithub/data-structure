package day0402;

import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {
		System.out.println("请输入单价:￥");
		@SuppressWarnings({ "resource" })
		//从键盘上输入一个double数，以回车键结束
		Scanner scanner = new Scanner(System .in);
		double peer = scanner .nextDouble();
		System.out.println("请输入数量：");
		double count = scanner .nextDouble();
		System.out.println("请输入金额：￥");
		double money = scanner .nextDouble();
		//购买的总额
		double procount = peer*count;
		double chanre ;
		if(procount >= 1000)
		{
			//如果总额大于1000商品打六折
			chanre = money - procount*0.6;
		}else if(procount >= 500 && procount <= 1000)
		{
			//如果总额在500到1000商品打八折
			chanre = money - procount*0.8;
		}else if (procount >= 100 && procount <= 500)
				{
					//如果总额在100到500商品打九折
					chanre = money - procount*0.9;
				}else chanre = money - procount;
				
		if(chanre>=0)
		{
			
			System.out.println("找零：￥"+chanre);
		}else System.out.println("余额不足，还需支付：￥"+(-chanre));
	
		
		
		
		
	}
	

}
