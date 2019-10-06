package com.cxk.studyjuc;

import java.util.concurrent.*;

/**
 * @author XingKe
 * @date 2019-06-03 21:22
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch downLatch = new CountDownLatch(3);
        ExecutorService ex = Executors.newCachedThreadPool();
        Worker w1 = new Worker(downLatch,"张三");
        Worker w2 = new Worker(downLatch,"李四");
        Worker w3 = new Worker(downLatch,"王五");
        Boss boss = new Boss(downLatch);

        ex.execute(w1);
        ex.execute(w2);
        ex.execute(w3);
        ex.execute(boss);

        ex.shutdown();

    }
}
