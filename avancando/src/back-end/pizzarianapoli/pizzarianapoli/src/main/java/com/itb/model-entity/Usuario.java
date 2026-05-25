package com.itb.in2em.pizzarianapoli.model.entity;

public class Usuario {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String sexo;
    private String logradouro;
    private String cep;
    private String bairro;
    private String cidade;
    private boolean codStatus;
    private String tipoUsuario; // Admin, Cliente ou Funcionario
    private String uf;

    public void setId(Long id) {
        this.id = id;
    }

    public Longe getId() {
        return id;
    }

    
}