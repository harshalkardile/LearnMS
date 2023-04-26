package com.lmsdemo1.LearnMS.controller;

import com.lmsdemo1.LearnMS.model.RegisterTe;
import com.lmsdemo1.LearnMS.service.RegTeService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
@Slf4j
@Controller
public class RegistrationControllerTeacher {


    private final RegTeService regTeService;

    @Autowired
    public RegistrationControllerTeacher(RegTeService regTeService) {

        this.regTeService = regTeService;
    }

    @RequestMapping("/RegistrationT")
    public String RegPage(Model model){
        model.addAttribute("registerte",new RegisterTe());
        return "/LoginModule/regestrationT.html";
    }


    @RequestMapping(value = "/saveMsgT", method = POST)
    public String saveMessage(@Valid @ModelAttribute("registerte") RegisterTe registerTe, Errors errors){
        if (errors.hasErrors()){
            log.error("Registration for validation failed due to :"+ errors.toString());
            return "/LoginModule/regestrationT.html";
        }
        regTeService.saveMessageDetails(registerTe);
        regTeService.setCounter(regTeService.getCounter()+1);
        log.info("Number of times the Regestration form is submitted:"+regTeService.getCounter());
        return "redirect:/RegistrationT";
    }
}
