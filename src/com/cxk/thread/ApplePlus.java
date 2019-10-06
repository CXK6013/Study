package com.cxk.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author XingKe
 * @date 2019-06-02 15:56
 */
public class ApplePlus {
     int number = 0;

    public  void addPlus(){
        number++;
    }

    public int getNumber() {
        return number;
    }
    AtomicInteger atomicInteger = new AtomicInteger(0);
    public  void addAtomicPlus(){
        atomicInteger.getAndDecrement();
    }
}
