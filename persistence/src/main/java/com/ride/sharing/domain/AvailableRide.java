package com.ride.sharing.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "RIDE")
@Data
public class AvailableRide implements Serializable {

    @Id
    @Column(name = "RIDE_ID")
    private String rideId;

    @Column(name="USER_NAME")
    private String name;
}
