package com.test_SMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/isexist")
    @ResponseBody
    public String isExist(@RequestParam("username") String username) {
        String msg = null;

        return msg;
    }
}
