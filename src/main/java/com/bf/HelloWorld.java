package com.bf;

/**
 * @description:
 * @author: bofei
 * @date: 2020-05-08 19:25
 **/
public class HelloWorld {
    private String name;

    public HelloWorld() {
        System.out.println("This is a HelloWorld constructor");
    }

    public void setName(String name) {
        System.out.println("This is a HelloWorld setName()");
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }

}
