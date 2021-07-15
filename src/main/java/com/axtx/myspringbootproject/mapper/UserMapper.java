package com.axtx.myspringbootproject.mapper;

import com.axtx.myspringbootproject.bean.UserBean;
import org.apache.ibatis.annotations.Param;

/**
 * BelongProject: myspringbootproject
 * BelongPackage: com.axtx.myspringbootproject.mapper
 * Author: hanxuesong
 * CreateTime: 2021-01-29
 * Description: todo
 */
public interface UserMapper {
    UserBean getInfo(@Param("name") String name, @Param("password") String password);
}
