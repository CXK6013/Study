package com.cxk.lambda;

/**
 * @author XingKe
 * @date 2019-04-27 11:35
 */
public class Person {
    private int age;
    private String username;

    public Person(int age, String username) {
        this.age = age;
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", username='" + username + '\'' +
                '}';
    }
}
