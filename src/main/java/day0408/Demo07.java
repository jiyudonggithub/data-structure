package day0408;

//import java.util.Arrays;

public class Demo07 {

	public static void main(String[] args) {
		/*
		 * 计算去掉第二大的年龄，和第三小的年龄
		 * 之后的平均值
		 * */
		int[] age = {90,85,100,45,22,60};
		double aver;
		double sum=0;
		Demo06.Bubbling(age);
		for (int i = 0; i < age.length; i++) {
			if (i==2||i==age.length-2) {
				continue;	
			}
			sum+=age[i];
		}
		aver=sum/(age.length-2);
		System.out.println("平均年龄为:"+aver);

	}

}
