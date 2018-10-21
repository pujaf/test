package com.ride.sharing.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "RIDE_INFORMATION")
@Data
public class RideInformation{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RIDE_ID")
    private String rideId;

    @Column(name="USER_ID")
    private String userId;

    @Column(name="ORIGIN")
    private String origin;

    @Column(name="DESTINATION")
    private String destination;

    @Column(name="AVAILABLE_SEATS")
    private String availableSeats;

    @Column(name="STATUS_INDICATOR")
    private String statusIndicator;

    @Column(name="DATE_OF_TRAVEL")
    private String dateOfTravel;

}
