import com.pojo.Human;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Human human = (Human) context.getBean("human");
        human.getDog().cry();
        human.getCat().cry();
    }
}
