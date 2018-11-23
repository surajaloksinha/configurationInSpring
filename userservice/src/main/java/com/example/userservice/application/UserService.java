package com.example.userservice.application;

import com.example.userservice.domain.SomeService;

public class UserService {
    private final SomeService someService;
    public UserService(final SomeService someService) {
    this.someService = someService;
    }


    public String fetchUser() {
        return someService.userData();
    }
}
