package com.bf;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;

import javax.annotation.processing.Messager;

/**
 * @description:
 * @author: bofei
 * @date: 2020-05-08 19:31
 **/
public class Main2 {

    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource("spring-config.xml"));

        HelloWorld helloWorld = (HelloWorld) factory.getBean("helloWorld");

        helloWorld.sayHello();
    }
    public static void main22(String[] args) {
        // 当执行到第一步创建IOC容器对象的时候就调用了HelloWorld类的构造方法和setter方法。
        Resource resource = new ClassPathResource("spring-config.xml");
        BeanFactory factory = new DefaultListableBeanFactory();

        BeanDefinitionReader bdr = new XmlBeanDefinitionReader((BeanDefinitionRegistry) factory);
        bdr.loadBeanDefinitions(resource);


        HelloWorld helloWorld = (HelloWorld) factory.getBean("helloWorld");

        helloWorld.sayHello();

    }

    public static void main222(String[] args) {
        // 当执行到第一步创建IOC容器对象的时候就调用了HelloWorld类的构造方法和setter方法。
        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        reader.loadBeanDefinitions(new ClassPathResource("spring-config.xml"));

        // 接下里 如何获取Bean？

    }

    public static void main3(String[] args) {
        // 当执行到第一步创建IOC容器对象的时候就调用了HelloWorld类的构造方法和setter方法。
        XmlBeanFactory context = new XmlBeanFactory(new PathResource("spring-config.xml"));

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.sayHello();

    }

    public static void main2(String[] args) {
        // 当执行到第一步创建IOC容器对象的时候就调用了HelloWorld类的构造方法和setter方法。
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.sayHello();

    }
}
