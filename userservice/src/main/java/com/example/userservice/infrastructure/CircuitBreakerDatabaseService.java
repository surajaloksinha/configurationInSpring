package com.example.userservice.infrastructure;


import com.example.userservice.domain.DatabaseService;

public class CircuitBreakerDatabaseService implements DatabaseService {
    private final DatabaseService underlyingService;

    public CircuitBreakerDatabaseService(final DatabaseService underlyingService) {
        this.underlyingService = underlyingService;
    }

    @Override
    public String userData() {
        //hystix suff
        return underlyingService.userData();

    }
}
