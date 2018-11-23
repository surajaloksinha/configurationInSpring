package com.example.userservice.infrastructure;


import com.example.userservice.domain.SunService;

public class CacheSunService implements SunService {
    private final SunService underlyingService;

    public CacheSunService(final SunService underlyingService) {
        this.underlyingService = underlyingService;
    }

    @Override
    public String userData() {
       //Check Cache if not found cache it
        return underlyingService.userData();
    }
}
