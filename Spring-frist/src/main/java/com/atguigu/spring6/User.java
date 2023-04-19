package com.atguigu.spring6;

public class User {
    private String name;
    private Person person;

    public void add() {
        System.out.println("add...");
    }

    public User() {
        System.out.println("无参函数被调用");
    }
}
