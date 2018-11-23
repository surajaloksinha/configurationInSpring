package com.example.userservice.configuration;

import com.example.userservice.domain.DatabaseService;
import com.example.userservice.infrastructure.CacheDatabaseService;
import com.example.userservice.infrastructure.CircuitBreakerDatabaseService;
import com.example.userservice.infrastructure.RemoteDatabaseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DatabaseServiceConfiguration {
    @Bean
    public DatabaseService someService(){
        return new CacheDatabaseService(new CircuitBreakerDatabaseService(new RemoteDatabaseService()));
    }
}
