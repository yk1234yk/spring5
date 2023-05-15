package com.atguigu.spring6.resource.conteoller;

import com.atguigu.spring6.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller("userController")
public class UserController {

//    1.根据名称进行注入
    @Resource(name = "myUserService")
    private UserService userService;

//    2/根据类型配置
//    @Resource
//    private UserService userService;

    public void add(){
        System.out.println("controller...");
        userService.add();
    }
}
