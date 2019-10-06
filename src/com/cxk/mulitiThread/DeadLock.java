package com.cxk.mulitiThread;

import java.util.concurrent.TimeUnit;

/**
 * @author XingKe
 * @date 2019-06-05 11:55
 */
public class DeadLock implements Runnable {
    Boolean bool;
    private Object o1 = new Object();
    private Object o2 = new Object();

    public DeadLock(Boolean bool) {
        this.bool = bool;
    }
    @Override
    public void run() {
        if (bool){
            synchronized (o1){
                System.out.println("获得A锁");
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2){
                    System.out.println("获得B锁");
                }
            }
        }else {
            synchronized (o2){
                System.out.println("获得B锁");
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1){
                    System.out.println("获得A锁");
                }
            }
        }
    }
}
