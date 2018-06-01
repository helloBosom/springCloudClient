package fun.peri.springcloudmybatisclient;

import fun.peri.springcloudmybatisclient.model.User;
import fun.peri.springcloudmybatisclient.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudmybatisclientApplicationTests {
    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        User user = new User("test", "test");
        System.out.println(userService.insertUser(user));
    }

}
