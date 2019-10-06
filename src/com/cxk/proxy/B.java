package com.cxk.proxy;

/**
 * @author XingKe
 * @date 2019-06-03 18:41
 */
class A implements Foo{
    @Override
    public void eat() {
        System.out.println("hello world");
    }
}
public class B implements Foo{
    private A a;
    @Override
    public void eat() {
        a.eat();
    }
}
