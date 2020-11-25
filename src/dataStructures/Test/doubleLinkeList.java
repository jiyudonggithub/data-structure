package dataStructures.Test;

import dataStructures.src.DoubleList;

/**
 * @Author: yudong
 * @Date: 2020/10/19
 * @Description:
 */
public class doubleLinkeList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        DoubleList<Integer> head = new DoubleList<Integer>();
        for (int i : arr) {
            head.addElement(i);
        }



    }
}
