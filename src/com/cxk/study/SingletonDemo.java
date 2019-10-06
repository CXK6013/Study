package com.cxk.study;

/**
 * @author XingKe
 * @date 2019-04-21 21:58
 */
public class SingletonDemo {

    private  SingletonDemo(){

    }
    private static SingletonDemo  singletonDemo = new SingletonDemo();

    public static  SingletonDemo getSingletonDemo(){
        return singletonDemo;
    }
}
