
package com.cxk.classLoadTime;


/**
 * @author XingKe
 * @date 2019-06-04 11:33
 * 测试static 成员变量
 */
public class TestStatic {
    public static void main(String[] args) {
        System.out.println(work.name);
    }
}
class work{
    static String name = "111";
}
