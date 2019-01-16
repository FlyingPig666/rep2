package com.itheima.factory;

import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;

public class UserServiceFactory {

    static UserService getBean(){
        return new UserServiceImpl();
    }

}
