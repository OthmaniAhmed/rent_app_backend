package com.example.project.rent_app_backend.Ads;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdsRepository extends MongoRepository<Ads, String> {
    List<Ads> findAdByCreatorId(String creatorId) ;

}
