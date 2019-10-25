package com.atguigu.webapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:
 **/
@Controller
public class Hellocontroller {
    @ResponseBody
    @RequestMapping("/success")
    public String hello(){
        return "success";
    }
}
