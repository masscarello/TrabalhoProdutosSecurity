package com.Mascarello.ProdutosSeguranca.repositories;

import com.Mascarello.ProdutosSeguranca.models.JobModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobRepository extends JpaRepository<JobModel, UUID> {
}
