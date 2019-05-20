package com.service.impl;

import com.dao.UserDao;
import com.pojo.Paper;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lcy
 * @version V1.0
 * @Package com.service.impl
 * @date 2019/5/20 10:29
 * @Copyright © 华据
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int deleteUserById(long id) {
        return userDao.deleteUserById(id);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public User queryById(long id) {
        return userDao.queryById(id);
    }

    @Override
    public List<User> queryAllUser() {
        return userDao.queryAllUser();
    }
}
