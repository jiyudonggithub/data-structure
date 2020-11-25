package day0408;

import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		/*  输入学生的数量、名字、数量
		 * 然后按照降序排列
		 * 
		 * */
		System.out.println("请输入学生数量");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] score = new int[num];
		String[] strings=new String[num];
		String temp;
		for (int i = 0; i < num; i++) {
			System.out.println("请输入学生姓名");
			strings[i]=scanner.next();
			System.out.println("请输入学生成绩");
			score[i]=scanner.nextInt();	
		}
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length-i-1; j++) {
				if (score[j]>score[j+1]) {
					score[j]=score[j]+score[j+1];
					score[j+1]=score[j]-score[j+1];
					score[j]=score[j]-score[j+1];
					temp=strings[j];
					strings[j]=strings[j+1];
					strings[j+1]=temp;
				}
			}
			
		}
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]+"的成绩为："+score[i]);
		}
	}

}
