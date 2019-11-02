package com.suixingpay.controller;

import com.suixingpay.StudentManApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/student-man")
    public String index(){
        return "index";
    }

    @RequestMapping("/studentIndex")
    public String studentIndex(){
        return "studentIndex";
    }

    @RequestMapping("/teacherIndex")
    public String teacherIndex(){
        return "teacherIndex";
    }
}
