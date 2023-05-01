package com.atguigu.service.impl;

import com.atguigu.anno.Bean;
import com.atguigu.anno.Di;
import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service......");
        //调用dao方法
        userDao.add();
    }
}
