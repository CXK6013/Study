package com.cxk.SingleInstance;

/**
 * @author XingKe
 * @date 2019-06-03 20:23
 */
public class StaticSingleTon {

    private static class SingleTon{
        private  static  StaticSingleTon  singleTon = new StaticSingleTon();
    }
    private StaticSingleTon(){

    }
    public  static  StaticSingleTon getSingleTon(){
        return SingleTon.singleTon;
    }
}
