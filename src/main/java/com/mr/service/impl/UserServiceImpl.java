package com.mr.service.impl;

import com.mr.dao.UserRepository;
import com.mr.model.User;
import com.mr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ydd on 2018/6/4.
 */
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public void add(User user) {
        userRepository.save(user);
    }

    @Override
    public Iterable<User> list() {
        Iterable<User> all = userRepository.findAll();
        return all;
    }

    @Transactional
    @Override
    public void del(Integer id) {
        userRepository.delete(id);
    }

    @Transactional
    @Override
    public void update(User user) {
        userRepository.save(user);
    }
}
