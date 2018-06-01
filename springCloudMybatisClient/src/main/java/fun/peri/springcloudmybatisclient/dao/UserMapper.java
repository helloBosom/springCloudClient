package fun.peri.springcloudmybatisclient.dao;

import fun.peri.springcloudmybatisclient.model.User;

public interface UserMapper {
    int insertUser(User record);

    int insertSelective(User record);
}