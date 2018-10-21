package com.ride.sharing.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "USER_LOGIN_INFORMATION")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private String userId;

    @Column(name="PASSWORD")
    private String password;

    @Column(name="USER_NAME")
    private String userName;
}
