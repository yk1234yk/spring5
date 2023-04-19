import com.atguigu.spring6.iocxml.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取bean
        User user = (User) context.getBean("user1");
        System.out.println("根据id获取bean:" + user);


        //根据类型获取bean(根据类型获取bean时，要求IOC容器中指定类型的bean有且只能有一个)
//        User user1 = context.getBean(User.class);
//        System.out.println("根据类型获取bean" + user1);


        //根据id和类型获取bean
        User user2 = context.getBean("user", User.class);
        System.out.println("根据id和类型获取bean:" + user2);
        user.run();
    }
//    @Test
//    public void test2(){
//        //根据类型获取bean
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        User user = context.getBean(User.class);
//        System.out.println("根据类型获取bean:"+user);
//    }
//    @Test
//    public void test3(){
//        //根据id和类型
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        User user = context.getBean("user", User.class);
//        System.out.println(user);
//    }
}
