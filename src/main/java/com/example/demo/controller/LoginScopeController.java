package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/login-scope")
public class LoginScopeController {
    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index(){
        return "result-login-scope";
    }
    @RequestMapping("/input-ac")
    public String inputAc(){
        String email= inputac.getN
        if(email== test@example.com)
        return "result-login-scope";
        
    }
    
    


}
