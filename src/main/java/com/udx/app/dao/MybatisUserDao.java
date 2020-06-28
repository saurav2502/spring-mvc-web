package com.udx.app.dao;

import com.udx.app.entity.User;

import java.util.List;

/**
 * Created By Saurav Kumar on 6/28/2020
 */
public interface MybatisUserDao {
    String addUser();
    User findUser(Long userId);
    List<User> findAllUsers();

}
