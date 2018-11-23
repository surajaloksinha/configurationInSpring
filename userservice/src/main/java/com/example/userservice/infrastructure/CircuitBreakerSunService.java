package com.example.userservice.infrastructure;


import com.example.userservice.domain.SunService;

public class CircuitBreakerSunService implements SunService {
    private final SunService underlyingService;

    public CircuitBreakerSunService(final SunService underlyingService) {
        this.underlyingService = underlyingService;
    }

    @Override
    public String userData() {
        //hystix suff
        return underlyingService.userData();

    }
}
