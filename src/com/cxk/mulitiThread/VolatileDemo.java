package com.cxk.mulitiThread;

import java.util.concurrent.TimeUnit;

/**
 * @author XingKe
 * @date 2019-06-14 20:25
 */
class MyData{
    volatile  int a = 0;

    public  void addTo60(){
        a = 60;
    }
}
public class VolatileDemo {
    public static void main(String[] args) {
        MyData myData = new MyData();

        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(3);
                myData.addTo60();
                System.out.println(myData.a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"AAA").start();

        while(myData.a == 0){

        }
        System.out.println(Thread.currentThread().getName()+myData.a);
    }
}
