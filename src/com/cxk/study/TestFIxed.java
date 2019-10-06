package com.cxk.study;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author XingKe
 * @date 2019-04-23 14:02
 */
public class TestFIxed {
    public static void main(String[] args) {
        ExecutorService ec = Executors.newFixedThreadPool(10000);
        for (int i = 0; i < 20000 ; i++) {
            ec.execute(()->{
                //System.out.println(thread.currentThread().getName()+"  "+DoubleCheckSingLeton.getDoubleCheckSingLeton());

                System.out.println(Thread.currentThread().getName()+""+DoubleCheckSingLeton.getDoubleCheckSingLeton());
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
