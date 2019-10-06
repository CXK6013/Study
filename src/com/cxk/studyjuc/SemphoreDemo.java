package com.cxk.studyjuc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author XingKe
 * @date 2019-06-03 22:48
 */
public class SemphoreDemo {
    public static void main(String[] args) {
       Semaphore semaphore = new Semaphore(2);
       work w1 = new work(semaphore,"zhangsan");
       work w2 = new work(semaphore,"zhangsan1");
       work w3 = new work(semaphore,"zhangsan2");
       work w4 = new work(semaphore,"zhangsan3");
       ExecutorService ex = Executors.newCachedThreadPool();

       ex.execute(w1);
       ex.execute(w2);
       ex.execute(w3);
       ex.execute(w4);

       ex.shutdown();

    }
}
class work implements Runnable{
    Semaphore semaphore;
    String name;

    public work(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name+"尝试获取许可证");
            semaphore.acquire();
            System.out.println(name+"已经获得许可证");
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
    }
}
