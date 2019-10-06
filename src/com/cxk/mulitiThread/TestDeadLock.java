package com.cxk.mulitiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author XingKe
 * @date 2019-06-05 12:11
 */
public class TestDeadLock {
    public static void main(String[] args) {
        DeadLock d1 = new DeadLock(true);
        DeadLock d2 = new DeadLock(false);
       new Thread(d1).start();
       new Thread(d2).start();
    }
}
