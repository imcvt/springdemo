package com.testspring.test;

import com.testspring.entity.User;
import com.testspring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author luoly
 * @date 2018/9/18 10:16
 * @description
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");

//        UserService userService = (UserService) context.getBean("userService");
        //开启注解自动扫描后通过类名取实例
        UserService userService = (UserService) context.getBean(UserService.class);

        User user = new User("lly1");
//        System.out.println("更新结果：-->"+userService.insertUserInfo(user));
        System.out.println(userService.save(user));
    }
}
