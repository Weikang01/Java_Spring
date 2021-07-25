import com.pojo.Student;
import com.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beams.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

    @Test
    public void test()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeams.xml");
        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");

        /*
        * by default bean's scope is "singleton"
        * true if scope="singleton": Spring will return the unique object every time we call it
        * false if scope="prototype": Spring will generate a new object every time we get bean
        * scope="request","session","application" only work in web development
        * */
        System.out.println(user == user2);

    }
}
