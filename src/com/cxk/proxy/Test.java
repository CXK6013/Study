package com.cxk.proxy;

import java.lang.reflect.Proxy;

/**
 * @author XingKe
 * @date 2019-06-03 17:34
 */
public class Test {
    public static void main(String[] args) {
        Bird bird = new Bird();
        DynamicProxyHandler handler = new DynamicProxyHandler(bird);
        Fly fly = (Fly) Proxy.newProxyInstance(bird.getClass().getClassLoader(),new Class[]{Fly.class},handler);
        fly.eat();
        System.out.println(bird.getClass().getName());
        System.out.println(fly.getClass().getName());
    }
}
