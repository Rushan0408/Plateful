package com.devtiro.restaurant.services;

import com.devtiro.restaurant.domain.GeoLocation;
import com.devtiro.restaurant.domain.entities.Address;
import org.springframework.stereotype.Service;

@Service
public interface GeoLocationService {
    GeoLocation geoLocate(Address address);
}
