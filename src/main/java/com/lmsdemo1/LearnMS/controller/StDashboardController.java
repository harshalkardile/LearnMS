package com.lmsdemo1.LearnMS.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class StDashboardController {

    @RequestMapping("/StudentD")
    public String displayDashboard(Model model,Authentication authentication) {
        model.addAttribute("username", authentication.getName());
        model.addAttribute("roles", authentication.getAuthorities().toString());
        //throw new RuntimeException("It's been a bad day!!");
        return "/Dashboards/LMS Student dashboard/index.html";
    }
//    @RequestMapping("/TeacherD")
//    public String displayTDashboard(Model model,Authentication authentication) {
//        model.addAttribute("username", authentication.getName());
//        model.addAttribute("roles", authentication.getAuthorities().toString());
//        //throw new RuntimeException("It's been a bad day!!");
//        return "Dashboards/LMS Teacher Dashboard/index.html";
//    }

}