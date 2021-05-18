package com.rpglojas.models;

import javax.persistence.*;

@Entity
@Table(name = "ITEM_QUALIDADE")
public class ItemQualidade {

    @Id
    @GeneratedValue
    @Column(name = "id_item_qualidade")
    private Long id;

    @Column(name = "descricao")
    private String descricao;


}
