package com.nest.Library_app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Libcontroller {
    @PostMapping("/")
    public String Adminlogin()
        {
            return "welcome to admin login page";
        }


}
