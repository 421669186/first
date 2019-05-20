package com.dao;

import com.pojo.User;
import com.pojo.Paper;

import java.util.List;

/**
 * @author lcy
 * @version V1.0
 * @Package com.dao
 * @date 2019/5/20 10:22
 * @Copyright © 华据
 */
public interface UserDao {
    int addUser(User user);

    int deleteUserById(long id);

    int updateUser(User user);

    User queryById(long id);

    List<User> queryAllUser();
}
