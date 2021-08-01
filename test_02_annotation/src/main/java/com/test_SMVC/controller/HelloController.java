package com.test_SMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/hellospring")
public class HelloController {
    //真实访问地址 : 项目名/hello
    @RequestMapping("/hello")
    public String transhello(Model model){
        model.addAttribute("msg","helloSpringAnnotation");
        //web-inf/jsp/hello.jsp
        return "hello";
    }
}
