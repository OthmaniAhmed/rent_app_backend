package com.example.project.rent_app_backend.Ads;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
@RequestMapping(value = "/api/ads/")
public class AdsController {

    @Autowired
    private AdsServer adsServer;


    @GetMapping(value = {"", "/"})
    public List<Ads> AdsList() {
        return adsServer.findAll();
    }

    @GetMapping("/{id}")
    public Ads getAdsById(@PathVariable String id){
        return adsServer.findById(id);
    }
    

    @PostMapping(value = {"", "/"})
    public void createNewAd( @RequestParam("post") String post, @RequestParam("image") MultipartFile image ) throws IOException {

        Ads ad = new ObjectMapper().readValue(post, Ads.class);
        ad.setPicture(new Binary(BsonBinarySubType.BINARY,image.getBytes()));
        adsServer.save(ad);
    }


        @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        adsServer.delete(id);
    }
}
