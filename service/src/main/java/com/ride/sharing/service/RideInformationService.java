package com.ride.sharing.service;

import com.ride.sharing.domain.RideInformation;

import java.util.Date;
import java.util.List;

public interface RideInformationService {
    List<RideInformation> getAllRide();
    List<RideInformation> getRideByOrigin(String origin, Date date);
    List<RideInformation> getRideByDestination(String destination);
    List<RideInformation> getRideByOriginAndDestination(String origin, String destination);
    }
