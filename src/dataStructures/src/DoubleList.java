package dataStructures.src;

/**
 * @Author: yudong
 * @Date: 2020/10/19
 * @Description:
 */
public class DoubleList<T> {
    private T data;
    private DoubleList next;
    private DoubleList previous;

    public DoubleList() {
    }

    public DoubleList(T data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }



    public void addElement(T num) {
        DoubleList<T> singleList = new DoubleList<T>(num);
        DoubleList P = this;
        while (P.next != null) {
            P = P.next;
        }
        P.next = singleList;
        singleList.previous = P;
        P = null;
    }
}
