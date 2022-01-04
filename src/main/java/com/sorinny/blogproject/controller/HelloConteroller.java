package com.sorinny.blogproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloConteroller {

    @GetMapping("/hello")
    public String hello(){
        return "hello SpringBoot Project!";
    }

}
