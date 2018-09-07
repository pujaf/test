package com.ride.sharing.service;

import com.ride.sharing.domain.AvailableRide;

import java.util.List;

public interface RideShareService {
    List<AvailableRide> getAllRide();
}
