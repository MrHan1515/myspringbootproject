package com.axtx.myspringbootproject.controller;

import com.axtx.myspringbootproject.bean.UserBean;
import com.axtx.myspringbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * BelongProject: myspringbootproject
 * BelongPackage: com.axtx.myspringbootproject.controller
 * Author: hanxuesong
 * CreateTime: 2021-01-29
 * Description: todo
 */

@Controller
public class LoginController {
    //将Service注入Web层
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        UserBean userBean = userService.loginIn(name,password);
        if(userBean!=null){
            return "success";
        }else {
            return "error";
        }
    }

}
