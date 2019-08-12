package com.bingsenh.seckill.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * @Author hbs
 * @Date 2019/8/12
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    private static Logger logger = (Logger) LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("to_login")
    public String toLogin(){
        return "login";
    }




}
