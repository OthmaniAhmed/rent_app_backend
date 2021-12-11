package com.example.project.rent_app_backend.Ads;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
@RequestMapping(value = "/api/ads/")
public class AdsController {

    @Autowired
    private AdsService adsService;


    @GetMapping(value = {"", "/"})
    public List<Ads> AdsList() {
        return adsService.findAll();
    }

    @GetMapping("/{id}")
    public Ads getAdsById(@PathVariable String id){
        return adsService.findById(id);
    }
    

    @PostMapping(value = {"", "/"})
    public void createNewAd( @RequestParam("post") String post, @RequestParam("image") MultipartFile image ) throws IOException {

      String imagePath =  adsService.saveImage(image);

       Ads ad = new ObjectMapper().readValue(post, Ads.class);
       ad.setPicture(imagePath);
        //  ad.setPicture(new Binary(BsonBinarySubType.BINARY,image.getBytes()));
        adsService.save(ad);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        adsService.delete(id);
    }


    @PutMapping("")
    public void update(@RequestParam("id") String id ,@RequestParam("comment") String comment) throws JsonProcessingException {
        Comments newComment = new ObjectMapper().readValue(comment,Comments.class);
        adsService.update(id ,newComment );
    }
}
