package com.oak;

import java.util.Arrays;

/**
 * @author 季于东
 * @date 2020/9/19
 */
public class Demo {

    public static void main(String[] args) {
        int[] arr = {5, 6, 8};
        int[] brr = new int[4];
        brr = Arrays.copyOf(arr,arr.length + 1);


        System.out.println(Arrays.toString(brr));
        System.out.println(brr.length);


    }



}
