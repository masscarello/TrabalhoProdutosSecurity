package com.Mascarello.ProdutosSeguranca.controllers;

import com.Mascarello.ProdutosSeguranca.models.ProdutoModel;
import com.Mascarello.ProdutosSeguranca.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path = "/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;
    @PostMapping
    public ProdutoModel save(@RequestBody ProdutoModel produtoModel) {
        return produtoService.save(produtoModel);
    }
    @GetMapping
    public List<ProdutoModel> findAll(){
        return produtoService.findAll();
    }




}
