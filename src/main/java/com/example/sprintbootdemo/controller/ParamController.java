package com.example.sprintbootdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

//@RestController
@Controller
public class ParamController {

    @RequestMapping("/param1")
    public String param1(){
        System.out.println("HHH");
        return "hello";
    }
}
