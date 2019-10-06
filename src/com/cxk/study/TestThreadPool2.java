package com.cxk.study;

import java.util.concurrent.*;

/**
 * @author XingKe
 * @date 2019-04-22 20:59
 */
public class TestThreadPool2 {

    public static void main(String[] args) {
        LinkedBlockingDeque<Runnable> arr = new LinkedBlockingDeque<>();
        ExecutorService definePol = new ThreadPoolExecutor(20,40,20L, TimeUnit.SECONDS,arr, Executors.defaultThreadFactory());
        for (int i = 0; i < 10; i++){
             definePol.execute(() -> {
                System.out.println("hello world");
            });
        }
        definePol.shutdown();
        System.out.println("执行完毕");
    }
}
