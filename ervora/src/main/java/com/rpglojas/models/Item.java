package com.rpglojas.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
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

    @Column(name ="preco_base")
    private BigDecimal precoBase;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<ItemLoja> lojas;

}
