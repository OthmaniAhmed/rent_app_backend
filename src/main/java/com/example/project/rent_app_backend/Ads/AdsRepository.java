package com.example.project.rent_app_backend.Ads;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdsRepository extends MongoRepository<Ads, String> {


}
