package com.example.project.rent_app_backend.apply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyService {

    @Autowired
    private ApplyRepository applyRepository;

    public List<Apply> findAll(){
        return applyRepository.findAll();
    }

    public Apply findById(String id){
        return  applyRepository.findById(id).get();
    }

    public Apply save(Apply apply){
        return applyRepository.insert(apply);
    }

    public void delete(String id){
        applyRepository.deleteById(id);
    }

}
