package com.cxk.study;

/**
 * @author XingKe
 * @date 2019-04-21 22:03
 */
public class SimpleSingletonDemo {

    private static  SimpleSingletonDemo singletonDemo = null;

    private SimpleSingletonDemo(){

    }

    public static SimpleSingletonDemo getSingletonDemo(){

        if (singletonDemo == null){
            return new SimpleSingletonDemo();
        }else {
            return singletonDemo;
        }
    }
}
