package com.ride.sharing.service;

import com.ride.sharing.domain.User;

public interface UserService {
    User validateuserLogin(String userName, String password);
}
