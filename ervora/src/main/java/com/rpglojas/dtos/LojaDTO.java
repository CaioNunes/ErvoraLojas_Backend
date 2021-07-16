package com.rpglojas.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rpglojas.models.Item;
import com.rpglojas.models.ItemLoja;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class LojaDTO implements Serializable {

    private Long id;
    private PersonagemDTO vendedor;
    private CidadeDTO cidade;
    private String nome;

    @JsonIgnoreProperties
    private List<ItemLojaDTO> itens;

    public LojaDTO(Long id, PersonagemDTO vendedor, CidadeDTO cidade, String nome){

    }

    public LojaDTO(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonagemDTO getVendedor() {
        return vendedor;
    }

    public void setVendedor(PersonagemDTO vendedor) {
        this.vendedor = vendedor;
    }

    public CidadeDTO getCidade() {
        return cidade;
    }

    public void setCidade(CidadeDTO cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ItemLojaDTO> getItens() {
        return itens;
    }

    public void setItens(List<ItemLojaDTO> itens) {
        this.itens = itens;
    }
}
