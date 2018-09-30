package com.testreflect;

/**
 * @author luoly
 * @date 2018/9/28 10:43
 * @description
 */
public class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void eat(String food) {
        System.out.println("eat some " + food +"s !");
    }
}
