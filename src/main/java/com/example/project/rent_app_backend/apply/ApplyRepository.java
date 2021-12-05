package com.example.project.rent_app_backend.apply;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplyRepository extends MongoRepository<Apply,String> {
    public List<Apply> findAppyByCreatorId(String creatorId);

}
