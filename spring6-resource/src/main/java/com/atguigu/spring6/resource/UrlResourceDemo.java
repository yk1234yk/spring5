package com.atguigu.spring6.resource;

import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;

//演示:访问网络资源
public class UrlResourceDemo {

    public static void main(String[] args) {
//        https前缀
//        loadUrlResource("https://www.baidu.com");
//        file前缀
        loadUrlResource("file:atguigu.txt");
    }

    //访问前缀http,file
    public static void loadUrlResource(String path) {
        try {
//        创建Resource实现类的对象UrlResource
            UrlResource url = new UrlResource(path);
//        获取资源名
            System.out.println(url.getFilename());
            System.out.println(url.getURL());
//            获取资源描述
            System.out.println(url.getDescription());
//            获取资源内容
            System.out.println(url.getInputStream().read());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
