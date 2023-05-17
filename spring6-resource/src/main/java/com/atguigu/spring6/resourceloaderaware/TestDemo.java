package com.atguigu.spring6.resourceloaderaware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ResourceLoader;

public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        TestBean testbean = context.getBean("testbean", TestBean.class);
        ResourceLoader resourceLoader = testbean.getResourceLoader();
        System.out.println(context==resourceLoader);
    }
}