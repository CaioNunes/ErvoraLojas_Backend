package com.rpglojas.dtos;

import com.rpglojas.models.ItemQualidade;

import java.math.BigDecimal;

public class ItemDTO {

    private Long id;
    private String nome;
    private String descricao;
    private Long codQualidadeItem;
    private Long codTipoItem;
    private BigDecimal peso;


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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getCodQualidadeItem() {
        return codQualidadeItem;
    }

    public void setCodQualidadeItem(Long codQualidadeItem) {
        this.codQualidadeItem = codQualidadeItem;
    }

    public Long getCodTipoItem() {
        return codTipoItem;
    }

    public void setCodTipoItem(Long codTipoItem) {
        this.codTipoItem = codTipoItem;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }
}
