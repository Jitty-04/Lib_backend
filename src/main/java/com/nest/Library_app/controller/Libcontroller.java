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
    @PostMapping("/bookentry")
    public String BookEntry()
    {
        return "welcome to book entry page";
    }
    @PostMapping("/booksearch")
    public String BookSearch()
    {
        return "welcome to book search page";
    }
    @PostMapping("/bookdelete")
    public String BookDelete()
    {
        return "welcome to book delete page";
    }
    @PostMapping("/bookedit")
    public String BookEdit()
    {
        return "welcome to book edit page";
    }





}
