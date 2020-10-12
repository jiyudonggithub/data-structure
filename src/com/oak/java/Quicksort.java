package com.oak.java;

import java.util.Arrays;

public class Quicksort {

    private int mid;

    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 7, 9, 3, 4, 5, 10, 8};
        int[] brr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quicksort(arr, 0, arr.length - 1);
        /*System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------");
        int[] mergeSort = mergeSort(brr, 0, brr.length - 1);
        System.out.println(Arrays.toString(mergeSort));
        System.out.println("--------------------------");
        selectSort(brr);
        System.out.println(Arrays.toString(brr));
        System.out.println("--------------------------");
        insertSort(brr);
        System.out.println(Arrays.toString(brr));*/
      /*  System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------");
        redixSort(arr);*/
//        BubbleSort(arr);
        int a = 6;
        int index = binarySearch(a,arr);
        System.out.println("the "+a+" of index is: "+index);


    }


    /**
     * 快速排序
     * 快速排序即根据先将最左边的数作为分界数，并定义左指针L为起始索引 ，右指针L为结束索引
     * 先从左端扫描如果该数不大于分界数的数则L++，找到大于分界数则退出扫描
     * 先从右端扫描如果该数不小于分界数的数则R--，找到小于分界数则退出扫描
     * 如果L < R 则交换左右端扫描到的数
     * 如果L = R相遇则表示该次排序完成
     *
     * @param array
     * @param left
     * @param right
     */
    public static void quicksort(int[] array, int left, int right) {
        if (left > right)
            return;
        int i = left, j = right;
        int pivot = array[left];
        while (i != j) {
            //找到右端小于privot并记录该值的索引
            while (array[j] >= pivot && i < j) {
                j--;
            }
            //找到左端大于privot并记录该值的索引
            while (array[i] <= pivot && i < j) {
                i++;
            }

            //如果找到对应数则进行交换

            if (i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            } else {
                //如果i==j说明此次排序结束
                array[left] = array[i];
                array[i] = pivot;
            }
        }
        quicksort(array, left, i - 1);
        quicksort(array, i + 1, right);
    }


    /**
     * 归并排序
     * 先将数据分单个数据
     * 再将数据两两进行归并排序
     * 直至排成一个有序的数组
     *
     * @param nums
     * @param left
     * @param right
     * @return
     */
    public static int[] mergeSort(int[] nums, int left, int right) {
        if (left == right)
            return new int[]{nums[left]};
        int mid = left + (right - left) / 2;
        int[] leftArr = mergeSort(nums, left, mid); //左有序数组
        int[] rightArr = mergeSort(nums, mid + 1, right); //右有序数组
        int[] newNum = new int[leftArr.length + rightArr.length]; //新有序数组

        int m = 0, i = 0, j = 0;
        /**
         先比较左数组和右数组的第一个元素
         小的放到新数组里
         依次比较下面的元素
         */
        while (i < leftArr.length && j < rightArr.length) {
            newNum[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
        }
        /**
         * 判断下左数组或右数组是否都放到新数组中
         * 如果没有则继续放入
         */
        while (i < leftArr.length)
            newNum[m++] = leftArr[i++];
        while (j < rightArr.length)
            newNum[m++] = rightArr[j++];
        return newNum;
    }


    /**
     * 选择排序
     * 第一次循环先找到最小数的索引
     * 如果索引不等于初始值则表示有比最小值还小的数
     * 则将该数赋值为最小值，之后依次循环
     *
     * @param arr
     */
    public static void selectSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
            if (minindex != i) {
                int tmp = arr[i];
                arr[i] = arr[minindex];
                arr[minindex] = tmp;
            }

        }
    }


    /**
     * 插入排序
     * 将无序数集插入有序数中
     * 先将a0假定为有序数，将后面的a1与之比较
     * 如果a1<a0 将a0后移 则排成[a1,a0]
     * 之后a2在[a1,a0]找到自己合适的位置插入进去
     *
     * @param arr
     */
    public static void insertSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[index] < arr[j]) {
                    int tmp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = tmp;
                    index = j;
                } else continue;
            }

        }

    }

    /**
     * 基数排序（分桶排序）
     * 先将数进行的各位放到对应的桶中，然后从桶中顺序放入数组中
     *
     * @param arr
     */
    public static void redixSort(int arr[]) {
        int max = Arrays.stream(arr).max().getAsInt();
        int maxlength = String.valueOf(max).length();
        int[][] buket = new int[10][arr.length];
        int[] buketElmentCount = new int[10];
        for (int i = 0, n = 1; i < maxlength; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                int digoffElment = arr[j] / n % 10;
                buket[digoffElment][buketElmentCount[digoffElment]++] = arr[j];
            }
            int index = 0;
            for (int j = 0; j < buketElmentCount.length; j++) {
                for (int z = 0; z < buketElmentCount[j]; z++) {
                    arr[index++] = buket[j][z];
                }
                buketElmentCount[j] = 0;
            }
        }

    }

    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
    }

    public static int binarySearch(int num, int arr[]) {
        Arrays.sort(arr);
        int L = 0;
        int R = arr.length;
        int mid = (L + R) / 2;
        while (L != mid) {
            if ( num > arr[mid] ){
                L = mid + 1;

            }
            if ( num < arr[mid] ){
                R = mid - 1;
            }
            if (num == arr[mid]) {
                return mid;
            }
            mid = (L + R) / 2;
        }
        return mid;
    }
}

