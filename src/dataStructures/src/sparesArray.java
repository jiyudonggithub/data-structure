package dataStructures.src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 季于东
 * @date 2020/7/2
 */
public class sparesArray {
    public static void main(String[] args) throws IOException {
        int[][] chessArr1 = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        System.out.println("原始的二维数组:");
        for (int[] ints : chessArr1) {
            for (int anInt : ints) {
                System.out.printf("%d\t", anInt);
            }
            System.out.println();
        }
        int sum = 0;
        for (int[] ints : chessArr1) {
            for (int anInt : ints) {
                if (anInt != 0) {
                    sum++;
                }
            }
        }
        int sparesArray[][] = new int[sum + 1][3];
        sparesArray[0][0] = chessArr1.length;
        sparesArray[0][1] = chessArr1[0].length;
        sparesArray[0][2] = sum;
        int index = 1;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1[0].length; j++) {
                if (chessArr1[i][j] != 0) {
                    sparesArray[index][0] = i;
                    sparesArray[index][1] = j;
                    sparesArray[index][2] = chessArr1[i][j];
                    index++;
                }
            }
        }
        System.out.println("转化成稀疏数组：");
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.map"));
        for (int[] ints : sparesArray) {
            for (int anInt : ints) {
                System.out.printf("%d\t", anInt);
                bw.write(anInt + "\t");
            }
            System.out.println();
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }
}
