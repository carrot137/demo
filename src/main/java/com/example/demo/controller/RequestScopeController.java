package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/request-scope")
public class RequestScopeController {
    @RequestMapping("")
    public String index(){
        return "request-scope-form";
    }

    @RequestMapping("/input")
    public String input(String name,Model model){
        model.addAttribute("name",name);
        return "result-request-scope";

    }

}
