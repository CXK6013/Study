package com.cxk.lambda;

import java.util.Arrays;

/**
 * @author XingKe
 * @date 2019-04-27 11:34
 */
public class TestCom {
    public static void main(String[] args) {
        Person[] persons = new Person[2];
        persons[0] = new Person(20,"张三");
        persons[1] = new Person(30,"李四");
        Arrays.sort(persons,( p1 , p2)->Integer.compare(p1.getAge(),p2.getAge()));
        System.out.println(Arrays.toString(persons));
    }
}
