import com.gao.mapper.UserMapper;
import com.gao.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;


public class MyTest {
    @Test
    public void testGetUserList() throws FileNotFoundException {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        final UserMapper mapper = context.getBean("userMapper2",UserMapper.class);
        for (User user : mapper.getUserList()) {
            System.out.println(user);
        }
    }
}
