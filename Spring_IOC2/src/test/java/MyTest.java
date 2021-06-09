import com.gao.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testConstruction(){
        final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final User user = (User) context.getBean("bieming");
        System.out.println(user.toString());
    }
}
