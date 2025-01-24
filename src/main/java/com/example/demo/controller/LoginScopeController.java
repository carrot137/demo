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
            return "login-scope";
        }
        @RequestMapping("/input-address")
        public String inputAddress(String keyEmail,String keyPass){
            String email="test@example.com";
            String pass="123";
            
        if(email.equals(keyEmail) && pass.equals(keyPass)){
            session.setAttribute("keyEmail",keyEmail );
            session.setAttribute("keyPass", keyPass);
        return "mypage";   
        } 
        else{
            return "login-scope";
        }
    }
        @RequestMapping("/mypage")
        public String myPage(){
        return "result-login-scope";
        
    }
}
