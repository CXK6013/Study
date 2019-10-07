package com.cxk.aboutstatic;

/**
 * @author XingKe
 * @date 2019-04-26 21:41
 */
class SuperClass{
    static {
        System.out.println("这是父类");
    }
    public static  int a = 0;
}
class   ChildClass{
    static {
        System.out.println("这是子类");
    }
    public final static  int value = 0;
}
public class Test {
    public static void main(String[] args) {
        // 测试用
        System.out.println(SuperClass.a);
        ChildClass[] ch = new ChildClass[10];
    }
}
