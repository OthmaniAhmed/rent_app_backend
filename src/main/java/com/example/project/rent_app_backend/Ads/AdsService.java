package com.example.project.rent_app_backend.Ads;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@Service
public class AdsService {

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

    public String saveImage(MultipartFile image) throws IOException {
        String folder = "C:\\Users\\GAMER\\Pojects\\Rent Application\\renting-application\\src\\assets\\photos/";
        byte[] bytes = image.getBytes();
        Path path = Paths.get(folder +image.getOriginalFilename());
        Files.write(path,bytes);

        return "../../../assets/photos/" +image.getOriginalFilename();
    }

    public void update(String id,Comments comments){
        System.out.println(comments.getCommenterName());

        Ads _ad = adsRepository.findById(id).get();
        _ad.setComment(comments);

        adsRepository.save(_ad);
    }

    public List<Ads> findAdsByCreatorId(String id) {
        return adsRepository.findAdByCreatorId(id);
    }

}