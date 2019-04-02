package com.ravi.controllers;

import com.ravi.Services.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class BasicController {


        @Autowired
         private BasicService basicService;


        @RequestMapping(value="/welcome", method = RequestMethod.POST)
        public String showWelcomePage(ModelMap model){
            model.put("name", "Ravi");
            model.put("password", "5454");
            return "welcome";
        }
    }

