package com.Mascarello.ProdutosSeguranca.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "TBL_PRODUTOS")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDoProduto;




}
