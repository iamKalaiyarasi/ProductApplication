package com.spring.project.webApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String greeting(){
        return "Hello";
    }

    @RequestMapping("/about")
    public String about(){
        return "Hi";
    }
}
