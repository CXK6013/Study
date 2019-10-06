package com.cxk.sort;

import java.util.Arrays;

/**
 * @author XingKe
 * @date 2019-06-12 22:06
 */
public class Selection_Sort {

    public static void main(String[] args) {
        int[] arr = {9,3,5,7};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void selectSort(int[] arr) {
        //需要记住最小的数的下标
        int length = arr.length;
        int minNumber = 0;
        for (int i = 0; i < length; i++) {
            minNumber = i;
            for (int j = i; j < length; j++) {
                if (arr[minNumber] > arr[j]) {
                    minNumber = j;
                }
            }
            swap(arr,minNumber,i);
        }
    }
    private static void swap(int[] arr, int index, int i) {
        int temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
    }
}
