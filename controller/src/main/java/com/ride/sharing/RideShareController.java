package com.ride.sharing;

import com.ride.sharing.domain.AvailableRide;
import com.ride.sharing.service.RideShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ride")
public class RideShareController {

    @Autowired
   private RideShareService rideShareService;

    @GetMapping("/getAll")
    public List<AvailableRide> getAllAvailableRides(){

        return rideShareService.getAllRide();
    }

    @PostMapping("/getAllRideByOrigin")
    public List<AvailableRide> getAllAvailableRidesByOrigin(@Validated @RequestBody AvailableRide availableRide){

        if(availableRide.getOrigin()!=null && availableRide.getDestination()==null) {
            return rideShareService.getRideByOrigin(availableRide.getOrigin());
        }
        else if(availableRide.getOrigin()==null && availableRide.getDestination()!=null) {
            return rideShareService.getRideByDestination(availableRide.getDestination());

        }
        else if(availableRide.getOrigin()!=null && availableRide.getDestination()!=null){
            return rideShareService.getRideByOriginAndDestination(availableRide.getOrigin(),availableRide.getDestination());

        }else
            return rideShareService.getAllRide();
    }
}
