import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testStudentBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        final Object student = context.getBean("student");
        System.out.println(student.toString());
    }
}
