package com.atguigu.spring6.iocxml.diTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-diarray.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.work();
    }
}
