package com.atguigu.spring6;

import com.atguigu.spring6.autowired.conteoller.UserController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserController {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController bean = context.getBean(UserController.class);
        bean.add();
    }
}
