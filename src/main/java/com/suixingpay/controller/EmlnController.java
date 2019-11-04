package com.suixingpay.controller;

import com.suixingpay.pojo.Company;
import com.suixingpay.pojo.Empeinf;
import com.suixingpay.service.EmlnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmlnController {
    @Autowired
    EmlnService emlnService;

    /**
     * 学生端：学生就业信息查询
     * @param stuId
     * @return
     */
    @RequestMapping("/studentEmInformation")
    public ModelAndView studentEmInformation(@RequestParam("stuId") Integer stuId){
        Empeinf empeinf = emlnService.getCompanyId(stuId);
        if(empeinf == null){
            throw new RuntimeException("没有公司");
        }
        Company company = emlnService.getCompany(empeinf.getEmpid());
        ModelAndView mv = new ModelAndView("StudentEmInformation");
        mv.addObject("company",company);
        return mv;
    }

    /**
     * 辅导员端：学生就业信息查询
     * @param stuId
     * @return
     */
    @RequestMapping("/teacherEmInformation")
    public ModelAndView teacherEmInformation(@RequestParam("stuId") Integer stuId){
        Empeinf empeinf = emlnService.getCompanyId(stuId);
        if(empeinf == null){
            throw new RuntimeException("没有公司");
        }
        Company company = emlnService.getCompany(empeinf.getEmpid());
        System.out.println(company);
        ModelAndView mv = new ModelAndView("TeacherEmInformation");
        mv.addObject("company",company);
        return mv;
    }

    //修改学生的公司信息
    @RequestMapping("/updateEmInformation")
    public String updateEmInformation(@RequestParam("stuId") Integer stuId, Company company){
        emlnService.updateCompanyById(company);
        return "redirect:/studentEmInformation?stuId="+stuId;
    }

    //修改学生的公司信息（辅导员端）
    @RequestMapping("/updateEmInformation2")
    public String updateEmInformation2(@RequestParam("stuId") Integer stuId, Company company){
        emlnService.updateCompanyById(company);
        return "redirect:/teacherEmInformation?stuId="+stuId;
    }
}
