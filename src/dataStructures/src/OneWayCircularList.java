package dataStructures.src;

import java.util.ArrayList;

/**
 * @Author: yudong
 * @Date: 2020/10/21
 * @Description:
 */
public class OneWayCircularList<T> {
    /*
        单向循环列表
     */
    private T data; //数据域
    public int length; //链表长度
    private OneWayCircularList next; //指针域

    public OneWayCircularList() {
        this.length = 0;
    }

    public OneWayCircularList(T data) {
        this.data = data;
        this.length = 0;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public OneWayCircularList getNext() {
        return next;
    }

    public void setNext(OneWayCircularList next) {
        this.next = next;
    }

    /**
     * 列表添加元素
     *
     * @param data 添加的元素
     */

    public void addelement(T data) {

        OneWayCircularList<T> a = new OneWayCircularList<>(data);
        OneWayCircularList p = this;
        while (p.next != this) {
            p = p.next;
        }
        p.next = a;
        a.next = this;
        this.length += 1;
    }

    @Override
    public String toString() {
        return data + "->";
    }

    /**
     * 创建环形列表
     *
     * @param arr
     */
    public void creatOneWayList(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                this.setData(arr[i]);
                this.next = this;
                this.length = 1;
            } else {
                this.addelement(arr[i]);
            }
        }

    }

    /**
     * 循环隔number个数输出队列
     * @param start 开始的位置
     * @param number 隔的数
     * @return
     */
    public ArrayList<T> outCircularOrder(int start, int number) {
        ArrayList<T> ts = new ArrayList<T>();
        OneWayCircularList p = this;
        int length = this.length;
        for (int i = 1; i < start; i++) {
            p = p.next;
        }
        while (length != 1) {
            for (int i = 1; i < number; i++) {
                p = p.next;
            }
            ts.add((T) p.getData());
            length -= 1;
        }
        ts.add((T) p.next.getData());

        return ts;

    }

    /**
     * 列表显示
     */
    public void show() {
        OneWayCircularList p = this;
        for (int i = 0; i < this.length; i++) {
            if (i == this.length - 1) {
                System.out.println(p.data);
            } else System.out.print(p);
            p = p.next;
        }

    }

}
