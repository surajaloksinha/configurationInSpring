package com.example.userservice.infrastructure;


import com.example.userservice.domain.DatabaseService;

public class CacheDatabaseService implements DatabaseService {
    private final DatabaseService underlyingService;

    public CacheDatabaseService(final DatabaseService underlyingService) {
        this.underlyingService = underlyingService;
    }

    @Override
    public String userData() {
       //Check Cache if not found cache it
        return underlyingService.userData();
    }
}
