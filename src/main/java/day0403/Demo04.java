package day0403;

//import java.util.Arrays;
import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {
		/*boolean isHave = true;
		if(isHave)System.out.println("酱油买回来了");
		else System.out.println("盐买回来了");*/
		//int []arr = new int[3];
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a = scanner.nextInt();
		System.out.println("请输入第二个数：");
		int b = scanner.nextInt();
		System.out.println("请输入第三个数：");
		int c = scanner.nextInt();
		//if(a >= b)System.out.println("最大的数是："+a);
		//else System.out.println("最大的数是："+b);
		//System.out.println("最大的数是："+(a > b? a:b));
		 /* arr[0] = a;
		  arr[1] = b;
		  arr[2] = c;
		  arr = Arr.ac(arr);
		  System.out.println("排序："+Arrays.toString(arr));*/

		if (a >= b) //ab
		{
			if(b >= c) //abc
				{
					System.out.println("从大到小顺序："+a+","+b+","+c);
				}else  //b<c
					{
						if (a >= c)  //acb
							{
								System.out.println("从大到小顺序："+a+","+c+","+b);
							}else  //cab
								{
									System.out.println("从大到小顺序："+c+","+a+","+b);
								}
						
					}
			
		}else //b>a
			{
				if(a >= c)	//bac
					{
						System.out.println("从大到小顺序："+b+","+a+","+c);
					}else //c>a
						{
							if (b >= c)  //bca
							{
								System.out.println("从大到小顺序："+b+","+c+","+a);
							}else   
								{
									System.out.println("从大到小顺序："+c+","+b+","+a);
								}
						}
			}
		

	}

}
