package com.atguigu.spring6.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User bean = context.getBean("user",User.class);
        System.out.println(bean);
    }
}
