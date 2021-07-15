package com.axtx.myspringbootproject.service;

import com.axtx.myspringbootproject.bean.UserBean;
import org.apache.ibatis.annotations.Param;

/**
 * BelongProject: myspringbootproject
 * BelongPackage: com.axtx.myspringbootproject.service
 * Author: hanxuesong
 * CreateTime: 2021-01-29
 * Description: todo
 */
public interface UserService {
    UserBean loginIn(@Param("name") String name, @Param("password") String password);

}
