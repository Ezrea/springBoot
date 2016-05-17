package com.twist.springBoot.model;

/**
 * @author Yingjie Chen
 * @date 2016/5/17
 */
public class Person {
    private String name;
    private Integer age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
