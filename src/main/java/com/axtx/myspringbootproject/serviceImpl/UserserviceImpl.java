package com.axtx.myspringbootproject.serviceImpl;

import com.axtx.myspringbootproject.bean.UserBean;
import com.axtx.myspringbootproject.mapper.UserMapper;
import com.axtx.myspringbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BelongProject: myspringbootproject
 * BelongPackage: com.axtx.myspringbootproject.serviceImpl
 * Author: hanxuesong
 * CreateTime: 2021-01-29
 * Description: todo
 */
@Service
public class UserserviceImpl implements UserService {

    //将DAO注入Service层
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name, password);
    }
}
