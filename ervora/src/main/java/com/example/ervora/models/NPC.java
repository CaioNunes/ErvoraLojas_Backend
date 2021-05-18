package com.example.ervora.models;

import javax.persistence.*;

@Entity
@Table(name = "NPC")
public class NPC {

    @Id
    @GeneratedValue
    @Column(name = "id_npc")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "tesouro")
    private Double tesouro;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

}
