package com.atguigu.spring6.iocxml.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.jupiter.api.Test
    public void test() {
// 如果一个接口有多个实现类，这些实现类都配置了 bean，根据接口类型可以获取 bean 吗？
// 不行，因为bean不唯一
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = context.getBean(PersonDaoImpl.class);
        System.out.println(userDao);
        userDao.run();
    }
}
