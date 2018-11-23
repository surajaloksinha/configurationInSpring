package com.example.userservice.application;

import com.example.userservice.domain.SunService;

public class UserService {
    private final SunService sunService;
    public UserService(final SunService sunService) {
    this.sunService = sunService;
    }


    public String fetchUser() {
        return sunService.userData();
    }
}
