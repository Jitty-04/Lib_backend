package com.nest.Library_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Libcontroller {
    @PostMapping("/")
    public String Adminlogin()
        {
            return "welcome to admin login page";
        }
    @PostMapping("/entry")
    public String BookEntry()
    {
        return "welcome to book entry page";
    }
    @PostMapping("/search")
    public String BookSearch()
    {
        return "welcome to book search page";
    }
    @PostMapping("/delete")
    public String BookDelete()
    {
        return "welcome to book delete page";
    }
    @PostMapping("/edit")
    public String BookEdit()
    {
        return "welcome to book edit page";
    }
    @GetMapping("/view")
    public String BookView()
    {
        return "welcome to view book  page";
    }





}
