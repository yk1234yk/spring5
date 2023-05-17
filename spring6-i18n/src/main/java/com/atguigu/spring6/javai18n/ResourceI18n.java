package com.atguigu.spring6.javai18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceI18n {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("zh", "CN"));
        System.out.println(bundle.getString("test"));
        ResourceBundle bundle2 = ResourceBundle.getBundle("messages", new Locale("en", "GB"));
        System.out.println(bundle2.getString("test"));
    }
}
