package day0408;

import java.util.Arrays;

public class Deom05 {

	public static void main(String[] args) {
		int[] scores = {90,85,100,45,22,60};
		int[] scores1 = new int[8];
		System.arraycopy(scores, 0, scores1, 1, scores.length);
		for (int i = 0; i < scores.length-1; i++) {
			for (int j = 0; j < scores.length-i-1; j++) {
				if (scores[j]>scores[j+1]) {
					scores[j]=scores[j]+scores[j+1];
					scores[j+1]=scores[j]-scores[j+1];
					scores[j]=scores[j]-scores[j+1];	
				}
			}	
		}
		scores1[0]=scores[scores.length-2];
		scores1[scores1.length-1]=scores[1];
		System.out.println(Arrays.toString(scores1));

	}

}
