import com.atguigu.spring6.iocxml.User;
import com.atguigu.spring6.iocxml.bean.PersonDaoImpl;
import com.atguigu.spring6.iocxml.bean.UserDao;
import com.atguigu.spring6.iocxml.bean.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        根据类型获取接口对应bean
//        UserDao userDao = context.getBean(UserDao.class);
//        System.out.println(userDao);
//        userDao.run();


//        根据id获取接口对应的bean
//        UserDaoImpl userDao = (UserDao) context.getBean("userDao");
//        PersonDaoImpl personDao = (PersonDaoImpl)context.getBean("personDao");
//        System.out.println(userDao);
//        System.out.println(personDao);
//        userDao.run();
//        personDao.run();

        //根据id和类型获取bean
        UserDaoImpl userDao = context.getBean("userDao", UserDaoImpl.class);
        PersonDaoImpl personDao = context.getBean("personDao", PersonDaoImpl.class);
        System.out.println(userDao);
        System.out.println(personDao);
        userDao.run();
        personDao.run();
    }
}
