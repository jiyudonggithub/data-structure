package dataStructures.Test;

import dataStructures.src.OneWayCircularList;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: yudong
 * @Date: 2020/10/21
 * @Description:
 */
public class OneWayCircularListTest {
    public static void main(String[] args) {
        OneWayCircularList<Integer> head = new OneWayCircularList<Integer>();
        Integer[] arr = {5, 8, 9, 10, 3, 6, 45};
        System.out.println(Arrays.toString(arr));
        head.creatOneWayList(arr);
        head.show();
        ArrayList<Integer> integers = head.outCircularOrder(2, 2);
        System.out.println(integers);

    }
}
