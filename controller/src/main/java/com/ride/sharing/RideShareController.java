package com.ride.sharing;

import com.ride.sharing.domain.AvailableRide;
import com.ride.sharing.service.RideShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
