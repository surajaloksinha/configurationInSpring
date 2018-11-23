package com.example.userservice.infrastructure;


import com.example.userservice.domain.DatabaseService;

public class RemoteDatabaseService implements DatabaseService {

    @Override
    public String userData() {
        return "Hi";
    }
}
