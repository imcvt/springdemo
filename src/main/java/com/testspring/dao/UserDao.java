package com.testspring.dao;

import com.testspring.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Random;

/**
 * @author luoly
 * @date 2018/9/17 17:27
 * @description
 */
public interface UserDao {

    int save(User user);

    int insert(User user);
}
