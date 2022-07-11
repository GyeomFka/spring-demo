package com.example.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDtoTest {

    @GetMapping(value = "/test")
    public UserDto test() {

        UserDto userDto = new UserDto();
        userDto.setName("hi");
        userDto.setAge(20);

        return userDto;
    }
    
}
