package com.cxk.studyjuc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author XingKe
 * @date 2019-06-03 21:16
 *  测试CountDownLatch
 */
public class Worker implements Runnable {

    private CountDownLatch countDownLatch;
    private String name;

    public Worker(CountDownLatch countDownLatch, String name) {
        this.countDownLatch = countDownLatch;
        this.name = name;
    }

    @Override
    public void run() {
        doWork();
        System.out.println(countDownLatch);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("活干完了");
        countDownLatch.countDown();
    }
    private void doWork() {
        System.out.println("开始干活");
    }
}
