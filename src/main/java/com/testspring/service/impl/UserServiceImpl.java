package com.testspring.service.impl;

import com.testspring.dao.UserDao;
import com.testspring.entity.User;
import com.testspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author luoly
 * @date 2018/9/18 14:43
 * @description
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    public int insertUserInfo(User user) {

        return userDao.insert(user);
    }

    public int save(User user) {
        int res = userDao.save(user);
        if(res < 0) {
            throw new RuntimeException("更新失败");
        }
        return res;
    }

}
