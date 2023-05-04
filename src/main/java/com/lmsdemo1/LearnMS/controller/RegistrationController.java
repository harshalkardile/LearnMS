package com.lmsdemo1.LearnMS.controller;

import com.lmsdemo1.LearnMS.model.RegisterSt;
import com.lmsdemo1.LearnMS.model.RegisterTe;
import com.lmsdemo1.LearnMS.service.RegStService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class RegistrationController {
//    private static Logger log= LoggerFactory.getLogger(RegistrationController.class);

    private final RegStService regStService;
    @Autowired
    public RegistrationController(RegStService regStService) {

        this.regStService = regStService;
    }

    @RequestMapping("/Registration")
    public String RegPage(Model model){
        model.addAttribute("registerst",new RegisterSt());
        return "/LoginModule/regestration.html";
    }

//    @RequestMapping(value = "/saveMsg", method = POST)
//    public ModelAndView saveMessage(@RequestParam String fname, @RequestParam String lname, @RequestParam String id,
//                                    @RequestParam String email, @RequestParam String rp, @RequestParam String mob ){
//
//        log.info("FName: " + fname);
//        log.info("LName: " + lname);
//        log.info("StudentID: " + id);
//        log.info("EmailID: " + email);
//        log.info("Passwords: " + rp);
//        log.info("Mobile: " + mob);
//        return new ModelAndView(("redirect:/Registration"));
//    }
    @RequestMapping(value = "/saveMsg", method = POST)
    public String saveMessage(@Valid @ModelAttribute("registerst") RegisterSt registerSt, Errors errors){
        if (errors.hasErrors()){
            log.error("Registration for validation failed due to :"+ errors.toString());
            return "/LoginModule/regestration.html";
        }
        regStService.saveMessageDetails(registerSt);
        return "redirect:/Registration";
    }
}

