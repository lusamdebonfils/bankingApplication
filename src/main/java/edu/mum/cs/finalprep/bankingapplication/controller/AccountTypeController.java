package edu.mum.cs.finalprep.bankingapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountTypeController {

    @GetMapping(value = {"/bankingapplication/accounttype/list"})
    public String displayAccountTypeList(){
        return "accountType/list";
    }

}
