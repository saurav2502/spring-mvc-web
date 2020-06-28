package com.udx.app.service;

import com.udx.app.dao.MybatisUserDao;
import com.udx.app.entity.User;
import org.apache.commons.logging.LogFactory;
import org.mybatis.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created By Saurav Kumar on 6/28/2020
 */

@Service
public class UserService {

    @Autowired
    private MybatisUserDao userDao;

    public User findUser(Long user) {
        return userDao.findUser(user);
    }

    public List<User> findAllUsers() {
        return userDao.findAllUsers();
    }
}
