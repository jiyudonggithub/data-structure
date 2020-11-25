package dataStructures.Test;

import dataStructures.src.SingleList;

import java.util.ArrayList;

/**
 * @author 季于东
 * @date 2020/10/9
 */
public class SingleListTest {
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 10, 3, 6, 45};
        new ArrayList<Integer>();
        SingleList head = SingleList.creatList();
        for (int i : arr) {
            head.addElement(i);
        }

        head.showList();

        System.out.println("the list of length is: " + head.length());
        try {
            head.insertElement(2, 13);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("the list of length is: " + head.length());
        head.showList();

        try {
            head.dellElement(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("the list of length is: " + head.length());
        head.showList();


    }
}
