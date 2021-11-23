package com.example.project.rent_app_backend.security;

import com.example.project.rent_app_backend.util.FirstTimeInitialize;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @Autowired
        private UserRepository userRepository;

    @Bean
    private PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        //return new User("ahmed", passwordEncoder().encode("ahmed"), AuthorityUtils.NO_AUTHORITIES);
        AppUser user = userRepository.findByEmail(userName);
        if(user == null){

            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"User not Found !");

        }
        return user;
    }

    public AppUser getUserByEmail(String userEmail){
        AppUser user = userRepository.findByEmail(userEmail);

        return user;
    }

    public void save(AppUser user){

        user.setPassword(passwordEncoder().encode(user.getPassword()));
        this.userRepository.save(user);

    }

    public List<AppUser> findAll(){
        return userRepository.findAll();
    }
}
