package edu.mum.cs.finalprep.bankingapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
    @GetMapping(value = {"/bankingapplication/account/list"})
    public String displayAccountTypeList(){
        return "account/list";
    }
}
