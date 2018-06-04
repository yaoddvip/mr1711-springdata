package com.mr.service;

import com.mr.model.User;

/**
 * Created by ydd on 2018/6/4.
 */
public interface UserService {
    void add(User user);

    Iterable<User> list();

    void del(Integer id);

    void update(User user);
}
