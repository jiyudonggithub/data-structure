package com.oak;

import org.junit.Test;

import java.util.Arrays;

import static com.oak.Quicksort.selectSort;

/**
 * @author 季于东
 * @date 2020/11/25
 */
public class QuickSortTest {
    @Test
    public void testApp(){
        int[] arr = {1, 6, 2, 7, 9, 3, 4, 5, 10, 8};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
