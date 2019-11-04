package com.suixingpay.controller;

import com.suixingpay.pojo.Login;
import com.suixingpay.service.LoginMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private LoginMapperService loginMapperService;

    @RequestMapping("/chanpass")
    public String changePassStudent(HttpServletRequest httpServletRequest){
        HttpSession session = httpServletRequest.getSession();
        int usersname = (int)session.getAttribute("studid");
        String[] strs =  httpServletRequest.getParameterValues("username");
        if (loginMapperService.selectStudentByStuIdService(usersname).getPassword().equals(strs[0])){
            if (strs[1].equals(strs[2])){
                Login login = new Login();
                login.setId(usersname);
                login.setPassword(strs[1]);
                login.setMark(0);
                loginMapperService.updateStudentService(login);
                return "success";
            }
        }
        return "false";
    }

    @RequestMapping("/chanpassteacher")
    public String changePassTeacher(HttpServletRequest httpServletRequest,int usersname){
        String[] strs =  httpServletRequest.getParameterValues("username");
        if (loginMapperService.selectStudentByStuIdService(usersname).getPassword().equals(strs[0])){
            if (strs[1].equals(strs[2])){
                Login login = new Login();
                login.setId(usersname);
                login.setPassword(strs[1]);
                login.setMark(1);
                loginMapperService.updateStudentService(login);
                return "success";
            }
        }
        return "false";
    }

    @RequestMapping("/logincheckStudent")
    public ModelAndView logincheckStudent(int username, String password,HttpServletRequest httpServletRequest){
        Login login = loginMapperService.selectStudentByStuIdService(username);
        ModelAndView mv=null;
        if (login!=null){
            if (password.equals(login.getPassword()) && login.getMark() == 0){
                mv = new ModelAndView("studentIndex");
                mv.addObject("username",login.getStuid());
                HttpSession session = httpServletRequest.getSession();
                session.setAttribute("studid",username);
                mv.addObject("session",session);
                return mv;
            }
        }
        mv = new ModelAndView("redirect:unsuccess.html");
        return mv;
    }

    @RequestMapping("/forgetpass")
    public String forgetPass(int username,String password){
        Login login = new Login();
        login.setStuid(username);
        login.setPassword(password);
        int result = loginMapperService.updateStudentService(login);
        if (result>0){
            return "redirect:student-man";
        }
        return "unsuccess.html";
    }
    @RequestMapping("/logincheckTeacher")
    public  ModelAndView logincheckTeacher(int username, String password){

        Login login = loginMapperService.selectStudentByStuIdService(username);
        ModelAndView mv=null;
        if (login!=null){
            if (password.equals(login.getPassword()) && login.getMark() == 1){
                mv = new ModelAndView("teacherIndex");
                mv.addObject("username",login.getStuid());
                return mv;
            }
        }
        mv = new ModelAndView("redirect:unsuccess.html");
        return mv;
    }
}
