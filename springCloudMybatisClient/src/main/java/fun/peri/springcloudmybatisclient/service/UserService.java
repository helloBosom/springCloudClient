package fun.peri.springcloudmybatisclient.service;

import fun.peri.springcloudmybatisclient.dao.UserMapper;
import fun.peri.springcloudmybatisclient.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
