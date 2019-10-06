package com.cxk.sort;

import java.util.Arrays;

/**
 * @author XingKe
 * @date 2019-09-07 9:34
 */
public class DutchFlagDemo {

    public static void dutchFlag(int[] arr , int num){
        int less = -1;
        int more = arr.length;
        int curr = 0;
        int temp = 0;

        while(curr < more){
            if (arr [curr] < num){
                temp = arr[curr];
                arr [curr++] = arr [++less];
                arr [less] = temp;
            }else if (arr [curr] > num){
                temp = arr[curr];
                arr [curr] = arr [--more];
                arr [more] = temp;
            }else{
                curr++;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {3,7,1,5,9};
        DutchFlagDemo.dutchFlag(arr,5);
        System.out.println(Arrays.toString(arr));
    }
}
