package com.ride.sharing.serviceImpl;

import com.ride.sharing.domain.RideInformation;
import com.ride.sharing.repository.RideInformationRepository;
import com.ride.sharing.service.RideInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RideInformationServiceImpl implements RideInformationService {

    @Autowired
    RideInformationRepository rideInformationRepository;

    @Override
    public List<RideInformation> getAllRide(){

        return rideInformationRepository.findAll();
    }

    @Override
    public List<RideInformation> getRideByOrigin(String origin,Date date){

        return rideInformationRepository.findByOriginAndDateOfTravel(origin,date);
    }
    @Override
    public List<RideInformation> getRideByDestination(String destination){

        return rideInformationRepository.findByDestination(destination);
    }
    @Override
    public List<RideInformation> getRideByOriginAndDestination(String origin, String destination){

        return rideInformationRepository.findByOriginAndDestination(origin,destination);
    }
}
