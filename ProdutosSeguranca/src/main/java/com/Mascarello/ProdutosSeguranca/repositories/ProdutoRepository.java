package com.Mascarello.ProdutosSeguranca.repositories;

import com.Mascarello.ProdutosSeguranca.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel,Long> {
}
