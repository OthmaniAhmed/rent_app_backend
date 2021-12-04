package com.example.project.rent_app_backend.security;


import com.example.project.rent_app_backend.Ads.Ads;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "api/auth")
public class AuthController {

    @Autowired
    private TokenUtil tokenUtil;

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;


    @PostMapping(value = {"register","register/"})
    public void createUser(@Valid @RequestBody AppUser user){
        userService.save(user);
    }

    @PostMapping(value = {"","/"})
    public  JwtResponse signIn(@RequestBody SignInRequest signInRequest) {

        final Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signInRequest.getEmail(), signInRequest.getPassword())
        );


        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetails userDetails = userService.loadUserByUsername(signInRequest.getEmail());
        String token = tokenUtil.generateToken(userDetails);

        AppUser user = userService.getUserByEmail(signInRequest.getEmail());
        JwtResponse response = new JwtResponse(token,user.getName(),user.getId());
        return response;

    }
    @GetMapping(value = {"userinfo/{id}","/userinfo/{id}"})
    public AppUser getUserById(@PathVariable String id){
        return userService.findUserById(id);
    }
}

