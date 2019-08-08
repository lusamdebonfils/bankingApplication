package edu.mum.cs.finalprep.bankingapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/"})
    public String displayIndex(){
        return "index";
    }

    @GetMapping(value = {"/home"})
    public String displayHome(){
        return "home/index";
    }

}
