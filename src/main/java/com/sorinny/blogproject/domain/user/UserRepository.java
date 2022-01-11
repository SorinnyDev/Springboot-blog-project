package com.sorinny.blogproject.domain.user;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.extension.ExtendWith;


import org.springframework.beans.factory.annotation.Autowired;

@ExtendWith(SpringExtension.class)
public class UserRepository {

    @Autowired
    UserRepository userRepository;

    @AfterEach
    public void cleanup(){
        userRepository.deleteAll();
    }
}
