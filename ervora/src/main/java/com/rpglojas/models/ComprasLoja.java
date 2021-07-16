package com.rpglojas.models;

import javax.persistence.*;

@Entity
@Table(name = "COMPRAS_LOJA")
public class ComprasLoja {

    @Id
    @GeneratedValue
    @Column(name = "id_compra_loja")
    private Long id;

    @Column(name = "quantidade_adquirida")
    private Integer quantidadeAdquirida;

    @OneToOne
    @JoinColumn(name = "id_comprador")
    private Personagem comprador;

    @OneToOne
    @JoinColumn(name = "id_item_loja")
    private ItemLoja itemAdquirido;

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

    public Personagem getComprador() {
        return comprador;
    }

    public void setComprador(Personagem comprador) {
        this.comprador = comprador;
    }

    public ItemLoja getItemAdquirido() {
        return itemAdquirido;
    }

    public void setItemAdquirido(ItemLoja itemAdquirido) {
        this.itemAdquirido = itemAdquirido;
    }
}
