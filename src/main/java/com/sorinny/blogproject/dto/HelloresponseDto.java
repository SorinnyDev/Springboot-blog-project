package com.sorinny.blogproject.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloresponseDto {
    private final String name;
    private final String nickname;
}
