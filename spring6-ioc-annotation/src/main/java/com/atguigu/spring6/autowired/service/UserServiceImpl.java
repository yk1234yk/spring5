package com.atguigu.spring6.autowired.service;


import com.atguigu.spring6.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
//    注入dao
//    1.属性注入
//    @Autowired
//    private UserDao userDao;

//    2.set注入
//    private UserDao userDao;
//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

//    3.构造器注入
//    private UserDao userDao;
//    @Autowired
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

//    4.形参注入
//    private UserDao userDao;
//
//    public UserServiceImpl(@Autowired UserDao userDao) {
//        this.userDao = userDao;
//    }

//    5.两个注解 根据名称注入
    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("Service....");
        userDao.add();
    }
}
