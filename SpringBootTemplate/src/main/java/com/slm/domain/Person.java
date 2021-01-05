package com.slm.domain;


public class Person {
    private String name;
    private String sex;

    public Person() {
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        System.out.println("person的getName方法");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        System.out.println("person的getSex方法");
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
