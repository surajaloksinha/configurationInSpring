package com.example.userservice.infrastructure;


import com.example.userservice.domain.SomeService;

public class RemoteSomeService implements SomeService {

    @Override
    public String userData() {
        return "Hi";
    }
}
