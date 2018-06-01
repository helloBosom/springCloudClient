package fun.peri.springcloudmybatisclient.controller;

import fun.peri.springcloudmybatisclient.model.User;
import fun.peri.springcloudmybatisclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/insertUser/{id}")
    public int insertTest(@PathVariable String id) {
        System.out.println("---------------------------------"+id);
        User user = new User("test", "test");
        return userService.insertUser(user);
    }
}
