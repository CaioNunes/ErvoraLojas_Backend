package com.rpglojas.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "CIDADE")
public class Cidade {

    @Id
    @GeneratedValue
    @Column(name = "id_cidade")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "tesouro")
    private BigDecimal tesouro;

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
