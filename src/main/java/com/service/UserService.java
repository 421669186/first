package com.service;

import com.pojo.Paper;
import com.pojo.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * @author lcy
 * @version V1.0
 * @Package com.service
 * @date 2019/5/20 10:27
 * @Copyright © 华据
 */
public interface UserService {
    int addUser(User user);

    int deleteUserById(long id);

    int updateUser(User user);

    User queryById(long id);

    List<User> queryAllUser();
}
