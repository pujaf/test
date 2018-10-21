package com.ride.sharing.serviceImpl;

import com.ride.sharing.domain.User;
import com.ride.sharing.repository.UserRepository;
import com.ride.sharing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User validateuserLogin(String userName, String password){
        return userRepository.findByUserNameAndPassword(userName,password);
    }

}
