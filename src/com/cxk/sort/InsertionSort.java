package com.cxk.sort;

import java.util.Arrays;

/**
 * @author XingKe
 * @date 2019-06-13 21:05
 */
public class InsertionSort {
    public static void main(String[] args) {
        int index = 4;
        int[] arr = {9,8,7,6,1};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void insertSort(int[] arr) {
        //刚开始默认有序
        int temp;
        int length = arr.length;
        for (int i = 1; i < length ; i++) {
            for (int j = i ; j > 0 ; j--){
                temp = j-1;
                arr[j] = arr[j] ^ arr[temp];
                arr[temp] = arr[j] ^ arr[temp];
                arr[j] = arr[j] ^ arr[temp];
            }
        }
    }
}
