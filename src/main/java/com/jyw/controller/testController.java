package com.jyw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by long on 2016/11/3.
 */
@Controller
public class testController {

    @RequestMapping("/test")
    public String test() {
        System.out.println("我是控制器");
        return "index";
    }
}
