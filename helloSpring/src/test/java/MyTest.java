import com.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // get spring context object
        ApplicationContext context = new ClassPathXmlApplicationContext("beams.xml");
        //
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
