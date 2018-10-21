package com.ride.sharing.controller;

import com.ride.sharing.domain.RideInformation;
import com.ride.sharing.service.RideInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/ride")
public class RideInformationController {

    @Autowired
   private RideInformationService rideInformationService;

    @GetMapping("/getAll")
    public List<RideInformation> getAllAvailableRides(){

        return rideInformationService.getAllRide();
    }

    @PostMapping("/getRideByOriginDestinationAndDate")
    public List<RideInformation> getRideByOriginDestinationAndDate(@Validated @RequestBody RideInformation rideInformation){

        if(rideInformation.getOrigin()!=null &&
                rideInformation.getDestination()==null
                    ) {
            Date date=new Date();
            return rideInformationService.getRideByOrigin(rideInformation.getOrigin(),date);
        }
        else if(rideInformation.getOrigin()==null &&
                 rideInformation.getDestination()!=null

                ) {
            return rideInformationService.getRideByDestination(rideInformation.getDestination());
        }
        else if(rideInformation.getOrigin()!=null &&
                rideInformation.getDestination()!=null ){
            return rideInformationService.getRideByOriginAndDestination(rideInformation.getOrigin(), rideInformation.getDestination());
        }
        else
            return rideInformationService.getAllRide();
    }
}
