package com.ride.sharing.repository;

import com.ride.sharing.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUserNameAndPassword(String userName,String password);
}
