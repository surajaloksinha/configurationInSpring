package com.example.userservice.configuration;

import com.example.userservice.domain.DatabaseService;
import com.example.userservice.application.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserServiceConfiguration {


    @Bean
    public UserService service(final DatabaseService databaseService){
        return new UserService(databaseService);
    }

}
