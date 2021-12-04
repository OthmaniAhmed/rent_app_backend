package com.example.project.rent_app_backend.Ads;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class AdsServer {

    @Autowired
    private AdsRepository adsRepository;


    //get all ads
    public List<Ads> findAll() {
        return adsRepository.findAll() ;
    }

    public Ads findById(String id) {
        return adsRepository.findById(id).get();
    }

    public Ads save(Ads ad) { return adsRepository.insert(ad); }

    public void delete(String id){
        adsRepository.deleteById(id);
    }
}
