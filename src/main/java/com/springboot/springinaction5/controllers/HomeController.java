package com.springboot.springinaction5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Deprecated
//@Controller
public class HomeController {

  //  @GetMapping("/")
    public String getHome(){
        return "home";
    }
}
