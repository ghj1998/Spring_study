import com.gao.service.UserService;
import com.gao.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testAOP(){
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        final UserService service = (UserService) context.getBean("userService");
        service.add();
    }
}
