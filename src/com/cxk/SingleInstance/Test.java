package com.cxk.SingleInstance;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author XingKe
 * @date 2019-06-03 20:26
 */
public class Test {
    public static void main(String[] args) {
        StaticSingleTon t = StaticSingleTon.getSingleTon();
        Executors.newCachedThreadPool();
        for (int i = 0; i < 20 ; i++) {
            new Thread(()-> System.out.println(StaticSingleTon.getSingleTon())).start();
        }
    }
}
