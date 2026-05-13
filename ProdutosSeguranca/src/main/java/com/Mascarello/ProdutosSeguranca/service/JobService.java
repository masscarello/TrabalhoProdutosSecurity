package com.Mascarello.ProdutosSeguranca.service;

import com.Mascarello.ProdutosSeguranca.models.JobModel;
import com.Mascarello.ProdutosSeguranca.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public JobModel save(JobModel jobModel){
        return jobRepository.save(jobModel);
    }

    public List<JobModel> findAll(){
        return jobRepository.findAll();
    }

}

