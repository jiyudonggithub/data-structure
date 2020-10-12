package dataStructures.src;

import java.util.Scanner;

/**
 * @author 季于东
 * @date 2020/7/2
 */
public class ArrayQueue {
    public static void main(String[] args) {
        QueueArray qA = new QueueArray(5);
        boolean loop = true;
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        while (loop) {
            System.out.println("s(show)查看队列");
            System.out.println("e(exit)退出程序");
            System.out.println("a(add)添加数据");
            System.out.println("g(get)取出数据");
            System.out.println("h(getHead)取出头部数据");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    qA.showQueue();
                    break;
                case 'a':
                    System.out.println("请输入添加的数：");
                    int value = scanner.nextInt();
                    try {
                        qA.addData(value);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'g':
                    try {
                        System.out.println(qA.getQueue());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        System.out.println(qA.headQueue());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    loop = false;
                    break;

            }


        }
        System.out.println("程序退出成功");

    }
}

class QueueArray {

    private int maxSize;//队列容量
    private int real;   //队列尾
    private int front;  //队列头
    private int[] arr;

    public QueueArray(int maxSize) {
        this.maxSize = maxSize;
        this.real = -1;
        this.front = -1;
        this.arr = new int[maxSize];
    }

    public boolean isFull() {
        return this.real == this.maxSize - 1;
    }

    public boolean isEmpty() {
        return this.real == this.front;
    }

    public void addData(int n) {
        if (this.isFull()) {
            throw new RuntimeException("队列满了");
        } else {
            this.real++;
            arr[real] = n;
        }
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        } else {
            front++;
            return arr[front];
        }
    }

    public void showQueue() {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\t", i, arr[i]);
        }
    }

    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        } else {
            return arr[front + 1];
        }
    }

}