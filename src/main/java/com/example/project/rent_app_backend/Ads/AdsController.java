package com.example.project.rent_app_backend.Ads;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public Ads createNewAd(@Valid @RequestBody Ads ad){
        return adsServer.save(ad);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        adsServer.delete(id);
    }
}
