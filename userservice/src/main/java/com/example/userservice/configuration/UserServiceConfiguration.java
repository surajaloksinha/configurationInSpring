package com.example.userservice.configuration;

import com.example.userservice.domain.SomeService;
import com.example.userservice.application.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserServiceConfiguration {


    @Bean
    public UserService service(final SomeService someService){
        return new UserService(someService);
    }

}
