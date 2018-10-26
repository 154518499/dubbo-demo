package com.dubbo.service.impl;

import com.dubbo.pojo.User;
import com.dubbo.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by scp on 2018/10/20.
 */
public class UserServiceImpl implements UserService {
    public List<User> queryAll() {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setAge(10 + i);
            user.setId(Long.valueOf(i + 1));
            user.setPassword("123456");
            user.setUsername("username_" + i);
            list.add(user);
        }
        return list;

    }
}
