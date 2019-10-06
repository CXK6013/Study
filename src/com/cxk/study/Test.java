package com.cxk.study;

import java.util.concurrent.*;

/**
 * @author XingKe
 * @date 2019-04-21 22:00
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Exception exception = new Exception();
        ArrayBlockingQueue<Runnable> arrayBlockingQueue = new ArrayBlockingQueue<>(102400);
        ExecutorService definedPool = new ThreadPoolExecutor(10000,20000,30L,TimeUnit.SECONDS,arrayBlockingQueue,Executors.defaultThreadFactory());
        for (int i = 0; i < 20000 ; i++) {
            definedPool.submit(()->{
                //System.out.println(thread.currentThread().getName()+"  "+DoubleCheckSingLeton.getDoubleCheckSingLeton());
                try{
                    System.out.println(Thread.currentThread().getName()+""+DoubleCheckSingLeton.getDoubleCheckSingLeton());
                }catch (Exception e){
                    e.printStackTrace();
                }
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        definedPool.shutdown();
        while (true) {
            if (definedPool.isTerminated()) {
                System.out.println("结束了！");
                break;
            }
            Thread.sleep(200);
        }
    }
}
