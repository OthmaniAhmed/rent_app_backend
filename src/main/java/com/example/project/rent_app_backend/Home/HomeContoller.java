package com.example.project.rent_app_backend.Home;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {

    @RequestMapping(value = "/")
    public String greeting(){
        return "Welcome to my test APIs for the renting project !!";
    }


}
