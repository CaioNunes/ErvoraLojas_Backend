package com.rpglojas.models;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tipo_item")
@NoArgsConstructor
public class ItemTipo {

    @Id
    @GeneratedValue
    @Column(name = "id_tipo_item")
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    public ItemTipo(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
