package com.test_SMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFulController {
    @RequestMapping("/h1/{p1}/{p2}")
    public String testResFul(Model model, @PathVariable int p1, @PathVariable int p2){
        String p12=""+p1+p2;
        model.addAttribute("msg","结果是"+p12);
        return "test1";
    }
}
