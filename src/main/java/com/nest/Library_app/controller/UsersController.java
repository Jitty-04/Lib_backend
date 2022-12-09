package com.nest.Library_app.controller;

import com.nest.Library_app.dao.UsersDao;
import com.nest.Library_app.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
public class UsersController {
    @Autowired
    private UsersDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addusers", consumes = "application/json", produces = "application/json")
    public Map<String, String> AddUser(@RequestBody Users u) {
        System.out.println(u.getName().toString());
        System.out.println(u.getAddress().toString());
        System.out.println(u.getAdhar().toString());
        System.out.println(u.getPincode());
        System.out.println(u.getDate().toString());
        System.out.println(u.getMbno());
        System.out.println(u.getEmail().toString());
        System.out.println(u.getUsername().toString());
        System.out.println(u.getPassword().toString());

        dao.save(u);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/usersearch",consumes ="application/json",produces ="application/json")
    public List<Users> SearchUser(@RequestBody Users u)
    {
        String username=u.getUsername().toString();
        String password=u.getPassword().toString();
        System.out.println(username);
        System.out.println(password);
        return (List<Users>) dao.SearchUser(u.getUsername(),u.getPassword());
    }

}

