import com.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beams.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}
