package com.rpglojas.dtos;

import com.rpglojas.models.ComprasLoja;
import com.rpglojas.models.ItemLoja;

import java.io.Serializable;
import java.math.BigDecimal;

public class ComprasLojaDTO implements Serializable {

    private Long id;
    private Integer quantidadeAdquirida;
    private PersonagemDTO comprador;
    private ItemLojaDTO itemAdquirido;

    public ComprasLojaDTO(){

    }

    public ComprasLojaDTO(Long id, Integer quantidadeAdquirida, PersonagemDTO comprador, ItemLojaDTO itemAdquirido){
        this.id = id;
        this.quantidadeAdquirida = quantidadeAdquirida;
        this.comprador = comprador;
        this.itemAdquirido = itemAdquirido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidadeAdquirida() {
        return quantidadeAdquirida;
    }

    public void setQuantidadeAdquirida(Integer quantidadeAdquirida) {
        this.quantidadeAdquirida = quantidadeAdquirida;
    }

    public PersonagemDTO getComprador() {
        return comprador;
    }

    public void setComprador(PersonagemDTO comprador) {
        this.comprador = comprador;
    }

    public ItemLojaDTO getItemAdquirido() {
        return itemAdquirido;
    }

    public void setItemAdquirido(ItemLojaDTO itemAdquirido) {
        this.itemAdquirido = itemAdquirido;
    }
}
