package com.cxk;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XingKe
 * @date 2019-07-03 15:34
 */
interface  Foo{};
class Alpth implements  Foo{}
class B extends  Alpth{

}
class  D extends  B{

}
public class Test {


    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println();
    }
}
