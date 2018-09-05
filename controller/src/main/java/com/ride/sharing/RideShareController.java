package com.ride.sharing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ride")
public class RideShareController {

    @GetMapping("/getAll")
    public String getAllAvailableRides(){
        return "All rides are available";
    }
}
