package com.suixingpay.controller;

import com.suixingpay.pojo.Studentinfo;
import com.suixingpay.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class StudentInfoController {

    @Autowired
    StudentInfoService studentInfoService;

    @RequestMapping("/goStudentIndex")
    public String goStudentIndex() {
        return "StudentIndex";
    }

    @RequestMapping("/selectStudent")
    public String selectStudent(Integer stuid, Model model) {
        Studentinfo studentinfo = studentInfoService.selectByPrimaryKey(1);
        model.addAttribute("studentinfo", studentinfo);
        return "student";
    }

    @RequestMapping("/updateStudent")
    @ResponseBody
    public String updateStudent(@ModelAttribute(value = "studentinfo") Studentinfo studentinfo) {
        System.out.println(studentinfo.getBirthdata());
        boolean flag = studentInfoService.updateStudent(studentinfo);
        System.out.println(flag);
        if (flag) {
            return "修改成功!";
        } else {
            return "修改失败!";
        }
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}
