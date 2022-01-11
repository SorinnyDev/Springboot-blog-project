package com.sorinny.blogproject.controller;

import com.sorinny.blogproject.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloConteroller {

    @GetMapping("/hello")
    public String hello(){
        return "hello SpringBoot Project!";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloresponseDto(@RequestParam("name") String name, @RequestParam("nickname") String nickname) {
        return new HelloResponseDto(name, nickname);
    }

}
