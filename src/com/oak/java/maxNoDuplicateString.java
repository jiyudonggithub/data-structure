package com.oak.java;

import java.util.ArrayList;

/**
 * @author 季于东
 * @date 2020/9/23
 */
public class maxNoDuplicateString {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        System.out.println("the s1 length: " + lengthOfLongestSubstring(s1));
        System.out.println("the s2 length: " + lengthOfLongestSubstring(s2));
        System.out.println("the s3 length: " + lengthOfLongestSubstring(s3));

    }

    /**
     * 最大不重复字串
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        ArrayList<Character> arrayList = new ArrayList<>();
        int N = s.length();
        int index = -1, anx = 0;
        for (int i = 0; i < N; i++) {
            if (i != 0) {
                arrayList.remove(Character.valueOf(s.charAt(i - 1)));
            }
            while (index + 1 < N && !arrayList.contains(s.charAt(index + 1))) {
                arrayList.add(s.charAt(index + 1));
                ++index;
            }
            anx = Math.max(anx, index - i + 1);
        }
        return anx;

    }
}
