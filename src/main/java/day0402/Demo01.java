package day0402;

import java.util.Scanner;

public class Demo01 {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		//char a = '\\';//103
		/*所有的整数默认int
		 * 所有的小数默认double*/
		//boolean b = true;
		int score = 9846;
		//int a,b,c,d;
		int a = 3;
		int b = 4;
		System.out.println(a & b);
		System.out.println("a:"+score/1000);
		System.out.println("b:"+score/100%10);
		System.out.println("c:"+score/10%10);
		System.out.println("d:"+score%10);
		System.out.println("===================");
		/*三目表达式  boolean 表达式 ？表达式1 ：表达式2；
		 * 如果布尔表达式为真则执行表达式1，
		 * 否自执行表达式2
		 * */
		//p 9 q 8 q 7 q 8 x8
		int i = -9;
		int j = i >= 0 ? i: -i;
		System.out.println(j);
		System.out.println("===================");
		/*接收用户输入的一个年份，判断这个年份是否为闰年
		闰年的判断的公式为：
		          1. 年份能被4整除，且不能被100整除的湿润年
		          2. 年份能被400整除的是闰年
		 */
		String aa ;
		System.out.println("请输入年份");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean bb = ((year % 4 ==0) && (year % 100 !=0)) || (year%400 ==0) ;
		aa = bb ? "是闰年" :"不是闰年";
		System.out.println(year+aa);
		
	}



}
