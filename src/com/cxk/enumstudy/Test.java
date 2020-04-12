package com.cxk.enumstudy;

import java.util.Arrays;
import java.util.Comparator;


/**
 * @author XingKe
 * @date 2019-10-11 19:18
 */

public class Test {
    public static void main(String[] args) {
        for (EnumDemo value : EnumDemo.values()) {
            System.out.println(value);
        }
    }
    public  static  Integer[][] countScore(Integer[][] score){
        int N =  score.length;
        Integer [] [] arr = new Integer [N][5];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0 ; j < score [i].length ; j++) {
                if (j == 0) {
                    arr[i][j] = score[i][j];
                } else if (j != 4) {
                    arr[i][j] = score[i][j];
                    sum = score[i][j] + sum;
                }
                if (j == 3) {
                    arr[i][4] = sum;
                }
            }
            sum = 0;
        }
        Arrays.sort(arr,new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] x, Integer[] y) {
                if(x[4] < y[4]){
                    return 1;
                } else if(x[4] > y[4]){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return arr;
    }
    public static void printArray(int [] [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0 ; j < arr [i].length ; j++) {
                System.out.print(arr [i] [j]+" ");
            }
            System.out.println();
        }
    }
}
