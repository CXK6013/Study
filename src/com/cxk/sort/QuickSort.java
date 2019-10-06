package com.cxk.sort;

import java.util.Arrays;

/**
 * @author XingKe
 * @date 2019-06-15 11:38
 */
public class QuickSort {
    public static void main(String[] args) {
        // 该程序完成了荷兰国旗问题,但是并没有快速排序
        int[] arr = {5 , 3 , 1 , 7 , 9};
       quickSort(arr,0,arr.length - 1);
       System.out.println(Arrays.toString(arr));
    }
    private static void quickSort(int[] arr, int left, int right) {
        if (arr == null){
            return;
        }
        if (left < right){
              int[] p =  partition(arr,left,right);
              quickSort(arr,left,p[0] - 1);
              quickSort(arr,p[1] + 1 ,right);
        }
    }
    private static int[] partition(int[] arr, int left, int right) {
        //小于枢轴元素的区域
        int less = left - 1;
        //大于枢轴元素的区域
        int more = right;
        while (left < more){
            if (arr[left] < arr[right]){
                swap(arr,++less,left++);
            }else if (arr[left] > arr[right]){
                swap(arr,--more,left);
            }else {
                left++;
            }
        }
        swap(arr, more, right);
        return new int[]{less + 1, more};
    }
    private static void swap(int[] arr, int less, int left) {
       int temp  = arr[less];
       arr[less] = arr[left];
       arr[left] = temp;
    }
}
