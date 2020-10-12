package com.oak.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author 季于东
 * @date 2020/9/18
 */
public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], String.valueOf(',')) + i + ",");
        }
        Arrays.sort(nums);
        if (target < (nums[0] + nums[1]) || target > (nums[nums.length - 2] + nums[nums.length - 1])) {
            int[] test = {0, 0};
            return test;
        } else {
            int[] ints = new int[2];
            for (int i = 0; i < nums.length; i++) {
                int i1 = target - nums[i];
                for (int j = nums.length - 1; j > 0; j--) {
                    if (i1 == nums[j]) {
                        if (nums[i] == nums[j]) {
                            String[] spliti = hashMap.get(nums[i]).split(",");
                            ints[0] = Integer.parseInt(spliti[spliti.length - 2]);
                            ints[1] = Integer.parseInt(spliti[spliti.length - 1]);
                            return ints;
                        }
                        String[] spliti = hashMap.get(nums[i]).split(",");
                        String[] splitj = hashMap.get(nums[j]).split(",");
                        ints[0] = Integer.parseInt(spliti[spliti.length - 1]);
                        ints[1] = Integer.parseInt(splitj[splitj.length - 1]);
                        return ints;
                    }

                }
            }
            return ints;
        }
    }


    public static List<List<Integer>> fullArray(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        List<Integer> collect = Arrays.stream(nums).boxed().collect(Collectors.toList());
        if (nums.length == 1) {
            lists.add(collect);
            return lists;
        }
        for (int i = 0; i < nums.length; i++) {
            collect.remove(Integer.valueOf(nums[i]));
            int[] ints = collect.stream().mapToInt(Integer::intValue).toArray();
            List<List<Integer>> lists1 = fullArray(ints);
            for (List<Integer> integers : lists1) {
                integers.add(0, nums[i]);
            }
            lists.addAll(lists1);
            collect.add(nums[i]);
        }


        return lists;
    }

    public static void backtrack(int[] nums, ArrayList<Integer> cure, List<List<Integer>> list) {
        if (nums.length == cure.size()) {
            list.add(new ArrayList<Integer>(cure));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (cure.contains(nums[i])) continue;
            cure.add(nums[i]);
            backtrack(nums, cure, list);
            cure.remove(cure.size() - 1);
        }
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        backtrack(nums, new ArrayList<Integer>(), lists);
        return lists;
    }

    public static byte[] addString(String s1, String s2) {
        byte[] ints = charToInt(s1);
        byte[] ints1 = charToInt(s2);
        int min = ints.length < ints1.length ? ints.length : ints1.length;
        int max = ints.length > ints1.length ? ints.length : ints1.length;
        byte[] ints2 = new byte[max];
        byte carry = 0;
        int i = 0;
        for (; i < min; i++) {
            byte sum = (byte) (ints[i] + ints1[i] + carry);
            if (sum >= 10) {
                ints2[i] = (byte) (sum % 10);
                carry = 1;
            } else {
                ints2[i] = (byte) sum;
                carry = 0;
            }

        }
        while (i < ints.length) {
            byte sum = (byte) (ints[i] + carry);
            if (sum >= 10) {
                ints2[i++] = (byte) (sum % 10);
                carry = 1;
            } else {
                carry = 0;
                ints2[i++] = (byte) sum;
            }
        }
        while (i < ints1.length) {
            byte sum = (byte) (ints1[i] + carry);
            if (sum >= 10) {
                ints2[i++] = (byte) (sum % 10);
                carry = 1;
            } else {
                ints2[i++] = (byte) sum;
                carry = 0;
            }
        }
        if (carry == 1) {
            byte[] ints3 = new byte[max + 1];
            ints3 = Arrays.copyOf(ints2, max + 1);
            ints3[max] = carry;
            return ints3;
        }
        return ints2;
    }

    public static byte[] charToInt(String s1) {
        char[] chars = s1.toCharArray();
        int N = chars.length;
        byte[] ints = new byte[N];
        for (int i = 0; i < N; i++) {
            ints[i] = (byte) Character.getNumericValue(chars[i]);
        }
        return ints;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String l1Val = "";
        String l2Val = "";
        while (l1 != null) {
            l1Val += l1.val;
            l1 = l1.next;

        }
        while (l2 != null) {
            l2Val += l2.val;
            l2 = l2.next;
        }
        byte[] bytes = addString(l1Val, l2Val);

        return creatListNode(bytes);


    }

    public static ListNode creatListNode(int[] nums) {
        ListNode node = new ListNode(nums[0]);
        ListNode node1 = node;
        for (int i = 1; i < nums.length; i++) {
            node1.next = new ListNode(nums[i]);
            node1 = node1.next;
        }
        return node;
    }

    public static ListNode creatListNode(byte[] nums) {
        ListNode node = new ListNode(nums[0]);
        ListNode node1 = node;
        for (int i = 1; i < nums.length; i++) {
            ListNode node2 = new ListNode(nums[i]);
            node1.next = node2;
            node1 = node1.next;
        }
        return node;
    }


    public static void main(String[] args) {
        int[] arr = {3, 7};
        int[] brr = {9, 2};
        int[] crr = {3};

        ListNode node1 = creatListNode(arr);
        ListNode node2 = creatListNode(brr);
        ListNode node = addTwoNumbers(node1, node2);
        while (node != null) {
            System.out.println("node.val:" + node.val);
            node = node.next;
        }


    }

}
