package com.testspring.dao.impl;

import com.testspring.dao.UserDao;
import com.testspring.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

/**
 * @author luoly
 * @date 2018/9/18 14:45
 * @description
 */
@Repository
public class UserDaoImpl implements UserDao{

    private JdbcTemplate jdbcTemplate;

    @Transactional
    public int save(User user) {
        int rs = jdbcTemplate.update("insert into test_userinfo values(null,?,now(),now(),null) ", user.getName());

        if(true) {
            throw new RuntimeException("更新失败回滚");
        }
        return  rs;
    }

    @Transactional
    public int insert(User user) {
        int rs = jdbcTemplate.update("insert into test_userinfo (name, createtime, updatetime) values (?, now(), now())",user.getName());
        return rs;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
