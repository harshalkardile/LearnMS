package com.lmsdemo1.LearnMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginModel {
//    @RequestMapping(value={
//            "/Login"
//    })
//    public String LoginPage(){
//
//        return "LoginModule/Login.html";
//    }

//    @RequestMapping(value={
//            "/RegistrationT"
//    })
//    public String RegTPage(){
//
//        return "LoginModule/regestrationT.html";
//    }

//    @RequestMapping(value={
//            "/LoginT"
//    })
//    public String LoginTPage(){
//
//        return "LoginModule/Tlogin.html";
//    }
    @RequestMapping(value={
            "/MailSentS"
    })
    public String MailSentS(){

        return "LoginModule/mail.html";
    }

    @RequestMapping(value={
            "/MailSentT"
    })
    public String MailSentT(){

        return "LoginModule/mailT.html";
    }
    @RequestMapping(value={
            "/ForgotPswd"
    })
    public String ForgotPswd(){

        return "LoginModule/forgotpswd2.html";
    }

//    @RequestMapping(value={
//            "/StudentD"
//    })
//    public String StudentDashboard(){
//
//        return "Dashboards/LMS Student dashboard/index.html";
//    }

    @RequestMapping(value={
            "/UpdateStudent"
    })
    public String StudentUpdate(){

        return "Dashboards/LMS Student dashboard/basic_elements.html";
    }

//    @RequestMapping(value={
//            "/TeacherD"
//    })
//    public String TeacherDashboard(){
//
//        return "Dashboards/LMS Teacher Dashboard/index.html";
//    }

    @RequestMapping(value={
            "/UpdateTeacher"
    })
    public String TeacherUpdate(){

        return "Dashboards/LMS Teacher Dashboard/basic_elements.html";
    }
}


