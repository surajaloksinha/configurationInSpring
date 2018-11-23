package com.example.userservice.infrastructure;


import com.example.userservice.domain.SomeService;

public class CircuitBreakerSomeService implements SomeService {
    private final SomeService underlyingService;

    public CircuitBreakerSomeService(final SomeService underlyingService) {
        this.underlyingService = underlyingService;
    }

    @Override
    public String userData() {
        //hystix suff
        return underlyingService.userData();

    }
}
