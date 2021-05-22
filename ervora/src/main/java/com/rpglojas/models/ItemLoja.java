package com.rpglojas.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name ="ITEM_LOJA")

public class ItemLoja {

    @Id
    @GeneratedValue
    @Column(name = "id_item_loja")
    private Long id;

    @Column(name = "id_item")
    private Long idItem;

    @Column(name = "id_loja")
    private Long idLoja;

    @Column(name = "preco")
    private BigDecimal preco;

    @Column(name = "quantidade")
    private Integer quantidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public Long getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(Long idLoja) {
        this.idLoja = idLoja;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
