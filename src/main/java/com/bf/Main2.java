package com.bf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: bofei
 * @date: 2020-05-08 19:31
 **/
public class Main2 {
    public static void main(String[] args) {
        // 当执行到第一步创建IOC容器对象的时候就调用了HelloWorld类的构造方法和setter方法。
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.sayHello();

    }
}
