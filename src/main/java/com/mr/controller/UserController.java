package com.mr.controller;

import com.mr.model.User;
import com.mr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ydd on 2018/6/4.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 增加数据
     * @return
     */
    @RequestMapping("/user/add")
    public String add(){
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        userService.add(user);
        return "success";
    }


    @RequestMapping("/user/list")
    public Iterable<User> list(){
        Iterable<User> list = userService.list();
        return list;
    }

    @RequestMapping("/user/del/{id}")
    public String del(@PathVariable Integer id){
        userService.del(id);
        return "success";
    }

    @RequestMapping("/user/update/{id}")
    public String update(@PathVariable Integer id){
        User user = new User();
        user.setId(id);
        user.setName("被修改");
        user.setAge(66);

        userService.update(user);
        return "success";
    }
}
