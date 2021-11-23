package com.example.project.rent_app_backend.util;

import com.example.project.rent_app_backend.security.AppUser;
import com.example.project.rent_app_backend.security.UserService;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FirstTimeInitialize implements CommandLineRunner {

    private final Log logger = LogFactory.getLog(FirstTimeInitialize.class);

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws  Exception {
        //check if we have user

        if (userService.findAll().isEmpty()){
            logger.info("No user found, creating some");
            AppUser user = new AppUser("ahmed", "ahmed@gmail.com", "ahmed");
            userService.save(user);

        }


    }
}
