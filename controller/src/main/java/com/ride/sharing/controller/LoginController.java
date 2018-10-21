package com.ride.sharing.controller;

import com.ride.sharing.constants.UtilityConstant;
import com.ride.sharing.domain.User;
import com.ride.sharing.response.Response;
import com.ride.sharing.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    UserService userService;


    @PostMapping("/validateLogin")
    public Response validateLogin(@Validated @RequestBody User user) {
        Response response = new Response();
        UtilityConstant utilityConstant = new UtilityConstant();

        if (!(StringUtils.isEmpty(user.getUserName()) || StringUtils.isEmpty(user.getPassword()))) {

            String userName = user.getUserName();
            String password = user.getPassword();
            try {
                User newUser = userService.validateuserLogin(userName, password);
                if (!newUser.equals(null)) {
                    response.setStatus(utilityConstant.STATUS_TRUE);
                    response.setMessage(utilityConstant.USER_FOUND);
                    response.setStatusCode(utilityConstant.STATUS_OK);
                }
            } catch (Exception e) {
                log.error("Exception occurred " +e);
                response.setStatus(utilityConstant.STATUS_FALSE);
                response.setStatusCode(utilityConstant.STATUS_ERROR);
                response.setMessage(utilityConstant.INVALID_USER_INFO);
            }
        } else {
            response.setStatus(utilityConstant.STATUS_FALSE);
            response.setMessage(utilityConstant.MISSING_INFO);
        }
        return response;
    }
}
