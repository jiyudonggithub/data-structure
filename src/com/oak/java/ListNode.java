package com.oak.java;

/**
 * @author 季于东
 * @date 2020/9/21
 */
public class ListNode {
    int val;
    int size = 0;
    ListNode next;

    public int getVal() {
        return val;
    }

    public int getSize() {
        return size;
    }

    public ListNode() {

    }

    public ListNode(int x) {
        val = x;
    }


    public void setVal(int val) {
        this.val = val;
    }


}
