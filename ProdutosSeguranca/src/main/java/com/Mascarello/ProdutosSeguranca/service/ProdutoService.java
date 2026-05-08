package com.Mascarello.ProdutosSeguranca.service;

import com.Mascarello.ProdutosSeguranca.models.ProdutoModel;
import com.Mascarello.ProdutosSeguranca.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoModel save(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }

    public List<ProdutoModel> findAll() {
        return produtoRepository.findAll();
    }

}
