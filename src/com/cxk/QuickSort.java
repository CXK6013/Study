package com.cxk;

import java.util.Arrays;

/**
 * @author XingKe
 * @date 2019-09-07 16:44
 */
public class QuickSort {

    private static void swap(int curr, int i,int[] arr) {
        int temp = arr[curr];
        arr[curr] = arr[i];
        arr[i] = temp;
    }
    public static int partion(int[] arr,int left, int right){
        int curr = left;
        --left;
        int pivot = curr;
        while(curr < right){
            if (arr[curr] < arr[pivot]){
                swap(curr++,++left,arr);
            }else if( arr[curr] > arr[pivot]){
                swap(curr,--right,arr);
            }else{
                curr++;
            }
        }
        return curr;

    }
    public static void quickSort(int[] arr, int left, int right){
        // 只有一个元素时无需排序
        if (left < right){
            int middle =  partion(arr, left,right);
            quickSort(arr, middle,arr.length);
            quickSort(arr, left, middle - 1);
        }
    }
    public static void quickSort(int [] arr) {
        if (arr == null || arr.length < 2){
            return;
        }
        quickSort(arr, 0, arr.length);
    }
    public static void main(String[] args) {
        int [] arr = {2,3,7,5,1,5,5,5,9};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));

    }


}
