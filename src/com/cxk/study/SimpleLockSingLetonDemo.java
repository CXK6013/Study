package com.cxk.study;

/**
 * @author XingKe
 * @date 2019-04-23 11:04
 */
public class SimpleLockSingLetonDemo {

    private SimpleLockSingLetonDemo(){

    }

    private static  SimpleLockSingLetonDemo singLetonDemo = null;

    public  static  synchronized SimpleLockSingLetonDemo getSingLetonDemo(){
        if (singLetonDemo == null){
            singLetonDemo = new SimpleLockSingLetonDemo();
            return singLetonDemo;
        }
        return singLetonDemo;
    }
}
