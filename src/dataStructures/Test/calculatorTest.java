package dataStructures.Test;

import dataStructures.src.Calculator;

/**
 * @Author: yudong
 * @Date: 2020/10/22
 * @Description:
 */
public class calculatorTest {
    public static void main(String[] args) {
        String s = "1+((2+3)*4)-5";
        Calculator cal = new Calculator();

        String s1 = cal.creatCalculator(s);
        System.out.println(s1);
        System.out.println(cal.calculation(s));

    }
}
