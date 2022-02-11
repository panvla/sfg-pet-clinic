package com.vladimirpandurov.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @RequestMapping({"","/","index","index.html"})
    public String index(){
        System.out.println("Some message to say... 123556t6asdfaqw");
        return "index";
    }
    @RequestMapping("/oups")
    public String oupsHandler(){
        return "notImplemented";
    }

}
