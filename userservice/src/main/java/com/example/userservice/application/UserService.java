package com.example.userservice.application;

import com.example.userservice.domain.DatabaseService;

public class UserService {
    private final DatabaseService databaseService;
    public UserService(final DatabaseService databaseService) {
    this.databaseService = databaseService;
    }


    public String fetchUser() {
        return databaseService.userData();
    }
}
