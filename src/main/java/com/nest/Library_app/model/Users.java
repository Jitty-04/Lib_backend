package com.nest.Library_app.model;

import com.nest.Library_app.dao.UsersDao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;
@Entity
@Table(name ="users")
public class Users {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String adhar;
    private String address;
    private int pincode;
    private String date;
    private String email;
    private int mbno;
    private String username;
    private String password;

    public Users() {
    }

    public Users(int id, String name, String adhar, String address, int pincode, String date, String email, int mbno, String username, String password) {
        this.id = id;
        this.name = name;
        this.adhar = adhar;
        this.address = address;
        this.pincode = pincode;
        this.date = date;
        this.email = email;
        this.mbno = mbno;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdhar() {
        return adhar;
    }

    public void setAdhar(String adhar) {
        this.adhar = adhar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMbno() {
        return mbno;
    }

    public void setMbno(int mbno) {
        this.mbno = mbno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


