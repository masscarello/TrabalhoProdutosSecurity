package com.Mascarello.ProdutosSeguranca.controllers;

import com.Mascarello.ProdutosSeguranca.models.ProdutoModel;
import com.Mascarello.ProdutosSeguranca.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (path = "/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    public ProdutoModel save(ProdutoModel produtoModel) {
        return produtoService.save(produtoModel);
    }

    public List<ProdutoModel> findAll(){
        return produtoService.findAll();
    }




}
