package com.cxk.study;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author XingKe
 * @date 2019-04-23 11:32
 */
public class DoubleCheckSingLeton {

    private DoubleCheckSingLeton(){

    }

    private static    DoubleCheckSingLeton doubleCheckSingLeton = null;

    public static synchronized DoubleCheckSingLeton getDoubleCheckSingLeton(){

        if (doubleCheckSingLeton == null){
            /*synchronized (DoubleCheckSingLeton.class){
                if (doubleCheckSingLeton == null){
                    doubleCheckSingLeton = new DoubleCheckSingLeton();
                }
            }*/
            doubleCheckSingLeton = new DoubleCheckSingLeton();
        }
        return  doubleCheckSingLeton;
    }
}
