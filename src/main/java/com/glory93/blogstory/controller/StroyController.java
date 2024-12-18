package com.glory93.blogstory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class StroyController {
    
    @RequestMapping("")    
    public String MainPage(){
        return "mainPage.html";
    }
}
