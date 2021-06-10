import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testAutowire() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        final Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
}
