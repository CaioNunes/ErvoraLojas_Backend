package com.rpglojas.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

public class CidadeDTO implements Serializable {

    private Long id;
    private String nome;
    private BigDecimal tesouro;

    public CidadeDTO(Long id, String nome, BigDecimal tesouro){
        this.id = id;
        this.nome = nome;
        this.tesouro = tesouro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getTesouro() {
        return tesouro;
    }

    public void setTesouro(BigDecimal tesouro) {
        this.tesouro = tesouro;
    }
}
