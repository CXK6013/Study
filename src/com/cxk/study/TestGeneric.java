package com.cxk.study;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.*;

/**
 * @author XingKe
 * @date 2019-04-22 15:26
 */

class Animal{

}
class Dog extends  Animal{

}
class Cat extends  Animal{


}
public class TestGeneric {

    public static  void main(String[] args) {
        //暂时用
       /* ArrayBlockingQueue<Runnable> arr = new ArrayBlockingQueue<>(10);
        ExecutorService definePol = new ThreadPoolExecutor(20,40,20L,TimeUnit.SECONDS,arr,Executors.defaultThreadFactory());
        for (int i = 0; i < 10; i++) {
            definePol.execute(()-> {
                System.out.println("hello world");
            });
        }*/
        System.out.println(Thread.activeCount());
        ThreadMXBean th = ManagementFactory.getThreadMXBean();
        ThreadInfo[] info = th.dumpAllThreads(false, false);
        for (ThreadInfo threadInfo : info) {
            //System.out.println(threadInfo.toString());
            System.out.println("所属线程组"+Thread.currentThread().getThreadGroup());
            System.out.println(threadInfo.getThreadId() + "正在执行" + threadInfo.getThreadName());
        }

     /*   definePol.shutdown();*/
    }
}
