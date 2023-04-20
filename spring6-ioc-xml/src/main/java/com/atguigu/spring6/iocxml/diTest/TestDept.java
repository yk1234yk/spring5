package com.atguigu.spring6.iocxml.diTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDept {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-diList.xml");
        Dept dept = context.getBean("dept", Dept.class);
        dept.info();
    }
}
