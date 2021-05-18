package com.example.ervora.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name ="ITEM_LOJA")

public class ItemLoja {

    @Id
    @GeneratedValue
    @Column(name = "id_item_loja")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_item")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "id_loja")
    private Loja loja;

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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
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
