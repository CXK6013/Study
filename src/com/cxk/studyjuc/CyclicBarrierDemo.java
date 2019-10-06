package com.cxk.studyjuc;

import java.util.concurrent.*;

/**
 * @author XingKe
 * @date 2019-06-03 22:18
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3,()-> System.out.println("我们开始开会"));
        Workers w1 = new Workers(cyclicBarrier,"w1");
        Workers w2 = new Workers(cyclicBarrier,"w2");
        Workers w3 = new Workers(cyclicBarrier,"w3");
        ExecutorService ex = Executors.newCachedThreadPool();
        ex.execute(w1);
        ex.execute(w2);
        ex.execute(w3);

        ex.shutdown();

    }
}
class Workers implements Runnable{
 private CyclicBarrier cyclicBarrier;
 private String name;

    public Workers(CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("您好"+name);

        try {
            cyclicBarrier.await();
            TimeUnit.SECONDS.sleep(10);
            System.out.println(name+"当前等待的线程数量为:"+cyclicBarrier.getNumberWaiting());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
