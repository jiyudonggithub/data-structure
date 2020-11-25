package dataStructures.src;

/**
 * @Author: yudong
 * @Date: 2020/10/21
 * @Description: 计算器类/栈
 */
public class Calculator {
    private String data;
    private Calculator next;
    private Calculator top;
    public int length;

    public Calculator() {
        this.top = this;
        this.length = 0;
    }

    public Calculator(String data) {
        this.data = data;
        this.top = this;
        this.length = 1;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Calculator getTop() {
        return top;
    }

    public void setTop(Calculator top) {
        this.top = top;
    }

    /**
     * 入栈
     * @param data
     */
    public void push(String data) {
        if (this.length == 0) {
            this.data = data;
            this.top = this;
        } else {
            Calculator a = new Calculator(data);
            a.next = this.top;
            this.top = a;
        }
        this.length += 1;
    }

    /**
     * 出栈
     * @return
     */
    public String pop() {
        String a = this.top.data;
        this.top = this.top.next;
        this.length -= 1;
        return a;
    }

    @Override
    public String toString() {
        return data +
                "->";
    }

    /**
     * 将中缀表达式转化成后缀表达式
     * @param s 中缀表达式
     * @return
     */
    public String creatCalculator(String s) {
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                str += c;
            } else {
                if (c == ')') {
                    this.push(String.valueOf(c));
                } else if (c == '(') {
                    str += eliminateParentheses();
                } else {
                    if (this.length > 0) {
                        if (this.top.data != ")") {
                            int pc = priority(String.valueOf(c));
                            int ptop = priority(this.top.data);
                            if (pc < ptop) {
                                str += this.pop();
                            }
                        }
                    }
                    this.push(String.valueOf(c));
                }
            }
        }
        while (this.top != null) {
            str += this.pop();
        }

        return new StringBuffer(str).reverse().toString();
    }

    /**
     * 计算中缀表达式
     * @param s
     * @return
     */
    public int calculation(String s) {
        s = this.creatCalculator(s);
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                this.push(String.valueOf(c));
            } else {
                int temp = 0;
                temp = getTemp(c, temp);
                this.push(String.valueOf(temp));
            }
        }

        return Integer.valueOf(this.pop());
    }

    /**
     * 计算前缀表达式
     * @param c
     * @param temp
     * @return
     */
    private int getTemp(char c, int temp) {
        Integer p1 = Integer.parseInt(this.pop());
        Integer p2 = Integer.parseInt(this.pop());
        switch (c) {
            case '-':
                temp = p1 - p2;
                break;
            case '+':
                temp = p1 + p2;
                break;
            case '*':
                temp = p1 * p2;
                break;
            case '/':
                temp = p1 / p2;
                break;
            default:
                break;
        }
        return temp;
    }

    /**
     * 计算优先级
     * @param c
     * @return
     */
    public int priority(String c) {
        if (c == "+" || c == "-")
            return 0;
        else
            return 1;
    }

    /**
     * 消除括号
     * @return
     */
    public String eliminateParentheses() {
        String s = "";
        while (!")".equals(this.top.data)) {
            s += this.pop();
        }
        this.pop();
        return s;
    }

    public void show() {
        Calculator p = this.top;
        while (p.next != null) {
            System.out.print(p);
            p = p.next;
        }
        System.out.println(p.data);
    }


}
