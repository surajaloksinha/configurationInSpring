package com.example.userservice.infrastructure;


import com.example.userservice.domain.SunService;

public class RemoteSunService implements SunService {

    @Override
    public String userData() {
        return "Hi";
    }
}
