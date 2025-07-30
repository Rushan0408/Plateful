package com.devtiro.restaurant.services.impl;

import com.devtiro.restaurant.domain.GeoLocation;
import com.devtiro.restaurant.domain.entities.Address;
import com.devtiro.restaurant.services.GeoLocationService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomLondonGeoLocationService implements GeoLocationService {

    private static final float MIN_LATITUDE = 51.28f; // Southern boundary of Greater London
    private static final float MAX_LATITUDE = 51.686f; // Northern boundary of Greater London
    private static final float MIN_LONGITUDE = -0.489f; // Southern boundary of Greater London
    private static final float MAX_LONGITUDE = 0.236f;

    @Override
    public GeoLocation geoLocate(Address address) {
        Random random = new Random();
        double latitude = MIN_LATITUDE + (MAX_LATITUDE - MIN_LATITUDE) * random.nextDouble();
        double longitude = MIN_LONGITUDE + (MAX_LONGITUDE - MIN_LONGITUDE) * random.nextDouble();
        return GeoLocation.builder()
                .latitude(latitude) // Random latitude around London
                .longitude(longitude) // Random longitude around London
                .build();
    }
}
