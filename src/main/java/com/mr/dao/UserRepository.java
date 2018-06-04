package com.mr.dao;

import com.mr.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 *  继承  CrudRepository<实体类 , 主键的类型>
 *
 * Created by ydd on 2018/6/4.
 */
public interface UserRepository extends CrudRepository<User , Integer>{

}
