package com.atguigu.spring6;

import com.atguigu.spring6.autowired.conteoller.UserController;
import com.atguigu.spring6.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserControllerAnno {
    public static void main(String[] args) {

        //加载配置类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController bean = context.getBean(UserController.class);
        bean.add();
    }
}
