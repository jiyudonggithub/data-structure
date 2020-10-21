package dataStructures.src;

/**
 * @author 季于东
 * @date 2020/10/9
 */

public class SingleList<T> {
    /*
      单链表
     */
    public T date; //数值
    public SingleList next; //下个指针

    public SingleList(T date) {
        this.date = date;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public SingleList getNext() {
        return next;
    }

    public void setNext(SingleList next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return date +
                "->";
    }

    public static SingleList creatList() {
        return new SingleList(null);
    }

    public void  creatList(Object[] arr) {
        for (Object i : arr) {
            this.addElement((T) i);
        }
    }

    public void addElement(T num) {
        SingleList singleList = new SingleList(num);
        SingleList P = this;
        while (P.next != null) {
            P = P.next;
        }
        P.next = singleList;
        P = null;
    }

    public void insertElement(int InsertIndex, int date) throws Exception {
        if ((this.next == null) && (InsertIndex > 0)) {
            throw new Exception("list is empty");
        } else {
            SingleList singleList = new SingleList(date);
            SingleList P = this;
            for (int i = 0; i < InsertIndex; i++) {
                P = P.next;
            }
            singleList.next = P.next;
            P.next = singleList;
            P = null;
        }
    }

    public void dellElement(int InsertIndex) throws Exception {
        if (this.next == null) {
            throw new Exception("list is empty");
        } else {
            SingleList P = this;
            for (int i = 0; i < InsertIndex; i++) {
                P = P.next;
            }
            P.next = P.next.next;
            P = null;
        }
    }

    public void showList() {

        if (this.next == null) {
            System.out.println("list is empty");
        } else {
            SingleList P = this.next;
            while (P.next != null) {
                System.out.print(P);
                P = P.next;
            }
            System.out.println(P.date);
            P = null;
        }
    }

    public int length() {
        if (this.next == null)
            return 0;
        else {
            int i = 0;
            SingleList P = this.next;
            while (P != null) {
                i++;
                P = P.next;
            }
            return i;
        }
    }
}
