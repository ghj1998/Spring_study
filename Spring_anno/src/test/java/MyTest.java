import com.gao.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testAnnotation(){
        final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final User user = context.getBean("user", User.class);
        System.out.println(user.name);
    }
}
