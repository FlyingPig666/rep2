package com.itheima.client;

import com.itheima.bean.User;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        UserService userService = applicationContext.getBean("userService" , UserService.class);

        User u = applicationContext.getBean("user", User.class);

        System.out.println(u.getName()+"==="+u.getAge()+"==="+u.getBirthday());

    }

}
