package com.oak.java;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {

        int[] arr = {15, 25, 35, 5, 45, 55, 65, 75, 85, 95};
        int max = arr.length - 1;
        int min = 0;
   /*     Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
        }*/
        Arrays.sort(arr);
        int num = 1000;
        int mid = (max + min) / 2;
        ;
        int count = 0;
        while (max > min) {
            count = mid;
            if (num > arr[mid]) {
                min = mid + 1;
            } else if (num < arr[mid]) {
                max = mid - 1;
            }mid = (max + min) / 2;
            //System.out.println(min + "," + mid + "," + max);
            if (count == mid)
                break;
        }
        System.out.println(arr[mid]);
    }
}
