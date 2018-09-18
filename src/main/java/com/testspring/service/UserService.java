package com.testspring.service;

import com.testspring.dao.UserDao;
import com.testspring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luoly
 * @date 2018/9/18 10:04
 * @description
 */
@Service
public interface UserService {

    int insertUserInfo(User user);

    int save(User user);

}
