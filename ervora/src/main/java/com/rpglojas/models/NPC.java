package com.rpglojas.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "NPC")
public class NPC implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_npc")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "tesouro")
    private Double tesouro;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

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

    public Double getTesouro() {
        return tesouro;
    }

    public void setTesouro(Double tesouro) {
        this.tesouro = tesouro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
