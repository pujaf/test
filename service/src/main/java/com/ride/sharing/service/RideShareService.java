package com.ride.sharing.service;

import com.ride.sharing.domain.AvailableRide;

import java.util.List;

public interface RideShareService {
    List<AvailableRide> getAllRide();
    List<AvailableRide> getRideByOrigin(String origin);
    List<AvailableRide> getRideByDestination(String destination);
    List<AvailableRide> getRideByOriginAndDestination(String origin,String destination);
    }
