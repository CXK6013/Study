package com.cxk.sort;

import java.util.HashMap;

/**
 * @author XingKe
 * @date 2019-06-15 14:04
 */
public class MergeSort {
    int[] arr;

    public MergeSort(int[] arr) {
        this.arr = new int[arr.length];

    }
    public static void sort(int[] result , int left , int right){
        if (left <= right){
            return;
        }
        int mid = left + (right - left) / 2;
        sort(result,left , mid);
        sort(result, mid +1 ,right);
    }
}
