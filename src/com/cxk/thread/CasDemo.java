package com.cxk.thread;


import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author XingKe
 * @date 2019-06-02 15:53
 */
public class CasDemo {
    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger(5);
        System.out.println(atomicInteger.compareAndSet(5, 2019)+"currData:"+atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(5, 1024)+"currData:"+atomicInteger.get());
    }
}
