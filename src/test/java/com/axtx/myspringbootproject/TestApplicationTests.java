package com.axtx.myspringbootproject;

import com.axtx.myspringbootproject.bean.UserBean;
import com.axtx.myspringbootproject.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * BelongProject: myspringbootproject
 * BelongPackage: com.axtx.myspringbootproject
 * Author: hanxuesong
 * CreateTime: 2021-01-29
 * Description: todo
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {
    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        UserBean userBean = userService.loginIn("zs","123");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

}
