package com.cxk.studyjuc;

import java.util.concurrent.CountDownLatch;

/**
 * @author XingKe
 * @date 2019-06-03 21:20
 */
public class Boss implements  Runnable{

    private CountDownLatch countDownLatch;

    public Boss(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        System.out.println("老板正在等所有的工人干完活.....");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("老板开始检查工人们的工作");
    }
}
