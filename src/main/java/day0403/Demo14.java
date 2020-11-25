package day0403;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		/*
		 * 请编写程序完成个人所得税计算。个税免征额3500元（工资薪金所得适用）

			级数 全月应纳税所得额全月        税率(%) 		速算扣除数
			
			1    不超过1,500元 		  3	     	0
			
			2    超过1,500元至4,500元的部分   10  	105
			
			3    超过4,500元至9,000元的部分   20  	555
			
			4    超过9,000元至35,000元的部分  25 		1,005
			
			5    超过35,000元至55,000元的部分 30 	2,755
			
			6    超过55,000元至80,000元的部分 35 	5,505
			
			7    超过80,000元的部分           	  45    13505
			
			例如：某人某月工资减去社保个人缴纳金额和住房公积金个人缴纳金额后为5500元，
			个税计算：(5500-3500)*10%-105=95元
			计算个税和到手工资
		 * 
		 * 
		 * */
		System.out.println("请输入个人工资：");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		int superfeer = money - 3500;
		double feer;
		if (superfeer < 0) {
			feer = 0;
		} else if (superfeer <= 1500) {
			feer = superfeer * 0.03;
		} else if (superfeer <= 4500) {
			feer = superfeer * 0.1 - 105;
		} else if (superfeer <= 9000) {
			feer = superfeer * 0.2 - 555;
		} else if (superfeer <= 35000) {
			feer = superfeer * 0.25 - 1005;
		} else if (superfeer <= 55000) {
			feer = superfeer * 0.3 - 2755;
		} else if (superfeer <= 80000) {
			feer = superfeer * 0.35 - 5505;
		} else {
			feer = superfeer * 0.45 - 13505;
		}
		System.out.println("个人所得税：" + feer+"税后所得工资：" + (money-feer));
	}

}
