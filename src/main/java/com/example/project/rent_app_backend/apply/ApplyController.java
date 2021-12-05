package com.example.project.rent_app_backend.apply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

    @GetMapping("/{id}")
    public List<Apply> getReplysByUserId(@PathVariable String id){
        return applyService.findReplysById(id);
    }
}
