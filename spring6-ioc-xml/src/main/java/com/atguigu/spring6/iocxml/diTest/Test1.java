package com.atguigu.spring6.iocxml.diTest;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diTest.xml");
        Emp emp = context.getBean("emp3", Emp.class);
        emp.work();
    }
}
