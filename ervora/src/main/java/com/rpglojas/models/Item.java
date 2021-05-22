package com.rpglojas.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "ITEM")
public class Item {

    @Id
    @GeneratedValue
    @Column(name = "id_item")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_item_qualidade")
    private ItemQualidade qualidadeItem;

    @ManyToOne
    @JoinColumn(name = "id_tipo_item")
    private ItemTipo tipoItem;

    @Column(name = "peso")
    private BigDecimal peso;

    @OneToMany(mappedBy = "idItem", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemLoja> lojas;

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

    public ItemQualidade getQualidadeItem() {
        return qualidadeItem;
    }

    public void setQualidadeItem(ItemQualidade qualidadeItem) {
        this.qualidadeItem = qualidadeItem;
    }

    public List<ItemLoja> getLojas() {
        return lojas;
    }

    public void setLojas(List<ItemLoja> lojas) {
        this.lojas = lojas;
    }

    public ItemTipo getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(ItemTipo tipoItem) {
        this.tipoItem = tipoItem;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }
}
