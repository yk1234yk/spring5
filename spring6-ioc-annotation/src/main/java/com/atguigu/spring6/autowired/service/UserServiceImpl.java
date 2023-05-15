package com.atguigu.spring6.autowired.service;


import com.atguigu.spring6.autowired.dao.UserDao;
import com.atguigu.spring6.autowired.dao.UserDaoImpl;
import com.atguigu.spring6.autowired.dao.UserRedisDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
//    注入dao
//    1.属性注入
//    @Autowired
//    private UserRedisDaoImpl userRedisDao;

//    2.set注入
//    private UserDao userDao;
//    @Autowired
//    public void setUserDao(UserDaoImpl userDao) {
//        this.userDao = userDao;
//    }

//    3.构造器注入
//    private UserDao userDao;
//    @Autowired
//    public UserServiceImpl(UserRedisDaoImpl userDao) {
//        this.userDao = userDao;
//    }

//    4.形参注入
//    private UserDao userDao;
//
//    public UserServiceImpl(@Autowired UserDaoImpl userDao) {
//        this.userDao = userDao;
//    }

//    5.两个注解 根据名称注入
    @Autowired
    @Qualifier(value = "userRedisDaoImpl")
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("Service....");
        userDao.add();
    }
}
