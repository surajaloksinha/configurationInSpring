package com.example.userservice.configuration;

import com.example.userservice.domain.SomeService;
import com.example.userservice.infrastructure.CacheSomeService;
import com.example.userservice.infrastructure.CircuitBreakerSomeService;
import com.example.userservice.infrastructure.RemoteSomeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SunServiceConfiguration {
    @Bean
    public SomeService someService(){
        return new CacheSomeService(new CircuitBreakerSomeService(new RemoteSomeService()));
    }
}
