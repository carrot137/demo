package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sum")
public class SumController {
    @RequestMapping("")
    public String index(){
        return "sum";
    }
    @RequestMapping("/input")
    public String input(String a,String b,String sum1,Model model){
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("sum1", sum1);
        
        
        return "result-sum";
        
    }

}
