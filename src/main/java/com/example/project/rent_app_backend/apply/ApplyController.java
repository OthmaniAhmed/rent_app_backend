package com.example.project.rent_app_backend.apply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/apply/")
public class ApplyController {

    @Autowired
    private ApplyService applyService;

    @PostMapping
    public Apply saveApply(@RequestBody Apply apply){
        return  applyService.save(apply);
    }
}
