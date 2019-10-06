package com.cxk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author XingKe
 * @date 2019-06-03 17:35
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Bird bird;

    public DynamicProxyHandler(Bird bird) {
        this.bird = bird;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args){
        try {
            method.invoke(bird,args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
