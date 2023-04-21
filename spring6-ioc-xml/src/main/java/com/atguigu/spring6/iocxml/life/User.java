package com.atguigu.spring6.iocxml.life;

public class User {
    private String name;

    //    无参数构造
    public User() {
        System.out.println("1 bean对象调用无参构造函数");
    }

//    初始化方法
    public void initMethod(){
        System.out.println("4 bean对象初始化，调用指定初始化函数");
    }
//    销毁方法
    public void destroyMethod(){
        System.out.println("7 bean对象销毁，调用指定销毁的函数");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2 bean对象设置属性值");
        this.name = name;
    }

}
