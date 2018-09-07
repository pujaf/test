package com.ride.sharing.serviceImpl;

import com.ride.sharing.domain.AvailableRide;
import com.ride.sharing.repository.AvailableRideRepository;
import com.ride.sharing.service.RideShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideShareServiceImpl implements RideShareService {

    @Autowired
    AvailableRideRepository availableRideRepository;

    @Override
    public List<AvailableRide> getAllRide(){
        return availableRideRepository.findAll();
    }
}
