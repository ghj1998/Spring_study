import com.gao.config.MyConfig;
import com.gao.pojo.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void testJAVAConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        final Dog dog = context.getBean("dog", Dog.class);
        System.out.println(dog.name);
    }
}
