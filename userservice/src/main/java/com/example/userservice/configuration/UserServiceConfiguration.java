package com.example.userservice.configuration;

import com.example.userservice.domain.SunService;
import com.example.userservice.application.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserServiceConfiguration {


    @Bean
    public UserService service(final SunService sunService){
        return new UserService(sunService);
    }

}
