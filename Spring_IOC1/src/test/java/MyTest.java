import com.gao.service.UserServiceImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testUserService(){
        // 获取ApplicationContext
        final ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 需要什么get什么
        final UserServiceImp userServiceImp = (UserServiceImp)context.getBean("userServiceImp");
        userServiceImp.getUser();
    }
}
