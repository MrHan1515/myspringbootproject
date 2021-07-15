package com.axtx.myspringbootproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * BelongProject: myspringbootproject
 * BelongPackage: com.axtx.myspringbootproject.controller
 * Author: hanxuesong
 * CreateTime: 2020-12-29
 * Description: todo
 */
@Controller
public class HelloWordController {

    @RequestMapping("/index")
    public String sayHello() {
        return "index.html";
    }
}
