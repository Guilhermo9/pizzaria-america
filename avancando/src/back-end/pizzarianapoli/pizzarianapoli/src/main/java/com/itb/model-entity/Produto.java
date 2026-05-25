package com.itb.in2em.pizzarianapoli.model.entity;

import java.math.BigDecimal;

public class Produto {

    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal valorCompra;
    private BigDecimal valorVenda;
    private int quantidadeEstoque;
    private boolean codStatus;

    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    
}