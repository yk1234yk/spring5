import com.atguigu.spring6.User;
import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    //创建Logger对象
    private final Logger logger = LoggerFactory.getLogger(TestUser.class);


    @Test
    public void testUserObject() {
        //加载spring配置文件,对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //获取创建的对象
//        User user = (User) context.getBean("user");
        User user = context.getBean(User.class);
//        User user = context.getBean("user", User.class);
        System.out.println(user);
        //使用对象调用方法进行测试
        user.add();

        //手动写日志
        logger.info("执行调用成功");
    }
    //反射创建对象
    @Test
    public void testUserObject1() throws Exception{
        Class<?> aClass = Class.forName("com.atguigu.spring6.User");
        //调用方法创建对象
//        Object o = aClass.newInstance();
        User o =(User) aClass.getDeclaredConstructor().newInstance();
        o.add();
        System.out.println(o);
    }
}
