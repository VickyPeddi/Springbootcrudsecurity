package com.example.springjwt.controller;

import com.example.springjwt.model.Jwtrequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
    @GetMapping("/test")
    public String returntest(){
        return "this is test input";
    }
}
