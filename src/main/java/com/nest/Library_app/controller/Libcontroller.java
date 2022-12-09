package com.nest.Library_app.controller;

import com.nest.Library_app.dao.LibraryDao;
import com.nest.Library_app.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Libcontroller {
   @Autowired
   private LibraryDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> AddBook(@RequestBody Library l) {
        System.out.println(l.getName().toString());
        System.out.println(l.getAuthor().toString());
        System.out.println(l.getDescription().toString());
        System.out.println(l.getPublisher().toString());
        System.out.println(l.getLanguage().toString());
        System.out.println(l.getDistributor().toString());
        System.out.println(l.getYear());
        System.out.println(l.getPrice());
        System.out.println(l.getImage().toString());
        dao.save(l);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes ="application/json",produces ="application/json")
    public List<Library> SearchBook(@RequestBody Library l)
    {
        String name= l.getName().toString();
        System.out.println(name);
        return (List<Library>) dao.SearchBook(l.getName());
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> DeleteBook(@RequestBody Library l) {
        String id=String.valueOf(l.getId());
        System.out.println(id);
        dao.DeleteBook(l.getId());
        HashMap<String,String> map = new HashMap<>();
        map.put("status","success");
        return map;

    }
    @PostMapping("/edit")
    public String BookEdit()
    {
        return "welcome to book edit page";
    }
    @CrossOrigin(origins = "*")
    @GetMapping(path="/viewall")
    public List<Library> ViewAllBooks(){
        return (List<Library>) dao.findAll();
    }
    @PostMapping("/issue")
    public String BookIssue()
    {
        return "welcome to book issue page";
    }
    @PostMapping("/userregistration")
    public String Userreg()
    {
        return "welcome to user registration page";
    }
    @PostMapping("/userlogin")
    public String Userlog()
    {
        return "welcome to user login page";
    }





}
