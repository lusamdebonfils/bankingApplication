package edu.mum.cs.finalprep.bankingapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @GetMapping(value = {"/bankingapplication/customer/list"})
    public String displayAccountTypeList(){
        return "customer/list";
    }

}
