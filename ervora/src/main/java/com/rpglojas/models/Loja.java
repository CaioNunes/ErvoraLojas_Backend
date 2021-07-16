package com.rpglojas.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "LOJA")
public class Loja implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_loja")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_npc")
    private Personagem vendedor;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "loja", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<ItemLoja> itens;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Personagem getVendedor() {
        return vendedor;
    }

    public void setVendedor(Personagem vendedor) {
        this.vendedor = vendedor;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ItemLoja> getItens() {
        return itens;
    }

    public void setItens(List<ItemLoja> itens) {
        this.itens = itens;
    }
}
