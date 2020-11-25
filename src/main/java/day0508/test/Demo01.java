package day0508.test;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] s1 = str.split(";");
        int rows = s1[1].length()/5;
        int cc = s1[1].length()%5;
        int ss = cc > 0 ?rows+1 : rows;
        int clos = Integer.parseInt(s1[0]);
        char[][] arr = new char[ss][clos];
        for (int i = 0; i < rows; i++) {
			for (int j = 0; j < clos; j++) {
				if (s1[1].length()>i*clos+j) {
					arr[i][j] = s1[1].charAt(i*clos+j);
				}else {
					break;
				}
			}
		}
        for (int i = 0; i <clos ; i++) {
        	for (int j = 0; j < rows; j++) {
				System.out.print(arr[j][i]);
			}
			
		}
        
    }

}
