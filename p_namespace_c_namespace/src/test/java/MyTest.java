import com.gao.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testCP(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        final User user1 = context.getBean("user1", User.class);
        final User user11 = context.getBean("user1", User.class);
        System.out.println(user1==user11);
        final User user2 = context.getBean("user2", User.class);
        final User user22 = context.getBean("user2", User.class);
        System.out.println(user2==user22);

    }
}
