package com.atguigu.spring6.autowired.conteoller;

import com.atguigu.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("MyUserController")
public class UserController {

//    注入service
//    1.属性注入
//    @Autowired//根据类型找到对应对象，完成注入
//    private UserService userService;


//    2.set方法注入
//    private UserService userService;
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

//    3.构造器方法注入
//    private UserService userService;
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

//    4.形参输入
//    private UserService userService;
//
//    public UserController(@Autowired UserService userService) {
//        this.userService = userService;
//    }

//    5.只有一个有参数构造函数,无注解
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void add(){
        System.out.println("controller...");
        userService.add();
    }
}
