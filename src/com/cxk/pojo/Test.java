package com.cxk.pojo;

import java.util.ArrayList;

/**
 * @author XingKe
 * @date 2019-06-08 13:00
 */
public class Test {
    public static void main(String[] args) {
        String a = "qq";
        String t = new String("ddd");
        int[] arr = new int[2];
        arr[0] = 1;
        test(t,arr);
		//aaa
//        System.out.println(test(t,arr));
//        System.out.println(arr[0]);
        System.out.println(t);
    }
    private static String test(String temp,int[] arr) {
        temp = "bbb";
        arr[0] = 2;
        return temp;
    }
}

