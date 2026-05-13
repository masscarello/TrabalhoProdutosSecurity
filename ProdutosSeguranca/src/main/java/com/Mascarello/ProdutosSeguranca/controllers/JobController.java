package com.Mascarello.ProdutosSeguranca.controllers;

import com.Mascarello.ProdutosSeguranca.models.JobModel;
import com.Mascarello.ProdutosSeguranca.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/jobs")
public class JobController {
    @Autowired
    private JobService jobService;
    @PostMapping
    public JobModel save(@RequestBody JobModel jobModel){
        return jobService.save(jobModel);
    }
    @GetMapping
    public List<JobModel> findAll(){
        return jobService.findAll();
    }


}
