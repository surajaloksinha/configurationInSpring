package com.example.userservice.configuration;

import com.example.userservice.domain.SunService;
import com.example.userservice.infrastructure.CacheSunService;
import com.example.userservice.infrastructure.CircuitBreakerSunService;
import com.example.userservice.infrastructure.RemoteSunService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SunServiceConfiguration {
    @Bean
    public SunService sunService(){
        return new CacheSunService(new CircuitBreakerSunService(new RemoteSunService()));
    }
}
