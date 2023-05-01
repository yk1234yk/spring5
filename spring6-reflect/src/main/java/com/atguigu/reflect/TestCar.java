package com.atguigu.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestCar {

    //1.获取Class对象多种方式
    /*
    1.getDeclaredConstructors获取构造方法
    2.getDeclaredFields获取属性
    3.getDeclaredMethods获取方法
     */
    @Test
    public void test01() throws Exception {
        //1.类名.Class
        Class clazz1 = Car.class;
        System.out.println(clazz1);
        //2.对象.getClass()
        Class clazz2 = new Car().getClass();
        System.out.println(clazz2);
        //3.Class.forName("全路径")
        Class clazz3 = Class.forName("com.atguigu.reflect.Car");
        System.out.println(clazz3);

        //实例化
        Car car = (Car) clazz3.getDeclaredConstructor().newInstance();
        System.out.println(car);
    }

    //2.获取构造方法
    @Test
    public void test02() throws Exception {
        Class clazz = Car.class;
        //获取所有构造函数
//        getConstructors()获取所有public方法
//        getDeclaredConstructor可以获取私有构造方法

        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor c : constructors) {
            System.out.println("方法名称: " + c.getName() + " 参数个数:" + c.getParameterCount());
        }

        //指定有参数构造创建对象
        //1.构造public方法
//        Constructor c1 = clazz.getConstructor(String.class, int.class, String.class);
//        Car car1 = (Car) c1.newInstance("夏利", 2, "红色");
//        System.out.println(car1);

        //2.构造private方法
        Constructor c2 = clazz.getDeclaredConstructor(String.class, int.class, String.class);
        c2.setAccessible(true);
        Car car2 = (Car) c2.newInstance("芭芭拉", 23, "女");
        System.out.println(car2);
    }

    //3.获取属性
    @Test
    public void test3() throws Exception {
        Class clazz = Car.class;
        //实例化
        Car car = (Car) clazz.getDeclaredConstructor().newInstance();
        //获取所有public属性
        Field[] fields1 = clazz.getFields();
        //获取所有属性(包含私有属性)
        Field[] fields2 = clazz.getDeclaredFields();
        for (Field field : fields2) {
            if (field.getName().equals("name")) {
                //设置允许访问
                field.setAccessible(true);
                field.set(car, "长安");
            }
            System.out.println(field);
            System.out.println(car);
        }
    }


    //4.获取方法
    @Test
    public void test4() throws Exception {
        Car car = new Car("白马", 12, "白色");
        Class clazz = car.getClass();
        //1.public方法
        Method[] methods = clazz.getMethods();
//        for (Method method:methods){
////            System.out.println(method.getName());
//            //执行方法
//            if (method.getName().equals("toString")){
//                String invoke =(String) method.invoke(car);
//                System.out.println("toString执行了:"+invoke);
//            }
//        }
        //2.private方法
        Method[] methods1 = clazz.getDeclaredMethods();
        for (Method method : methods1) {
//            0System.out.println(method);
            //执行私有方法
            if (method.getName().equals("run")) {
                method.setAccessible(true);
                method.invoke(car);
            }
        }

    }
}
