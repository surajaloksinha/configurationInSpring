package com.example.userservice.infrastructure;


import com.example.userservice.domain.SomeService;

public class CacheSomeService implements SomeService {
    private final SomeService underlyingService;

    public CacheSomeService(final SomeService underlyingService) {
        this.underlyingService = underlyingService;
    }

    @Override
    public String userData() {
       //Check Cache if not found cache it
        return underlyingService.userData();
    }
}
