package com.atguigu.spring6.resource.service;


import com.atguigu.spring6.resource.dao.UserDao;
import com.atguigu.spring6.resource.dao.UserDaoImpl;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "myUserService")
public class UserServiceImpl implements UserService {


//    不指定名称，根据属性名称进行注入
    @Resource(name = "myUserDao")
    private UserDao myUserDao;

    @Override
    public void add() {
        System.out.println("Service....");
        myUserDao.add();
    }
}
