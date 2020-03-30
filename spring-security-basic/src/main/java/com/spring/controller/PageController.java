package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// This class will be responsible for controlling the incoming requests
@Controller
public class PageController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String indexPage() {
        return "index";
    }

    @RequestMapping(value="/admin", method=RequestMethod.GET)
    public String adminPage() {
        return "admin";
    }


}
