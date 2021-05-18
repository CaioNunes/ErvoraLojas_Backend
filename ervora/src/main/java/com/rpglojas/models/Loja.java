package com.rpglojas.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "LOJA")
public class Loja {

    @Id
    @GeneratedValue
    @Column(name = "id_loja")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_npc")
    private NPC vendedor;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

    @OneToMany(mappedBy = "loja", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemLoja> itens;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NPC getVendedor() {
        return vendedor;
    }

    public void setVendedor(NPC vendedor) {
        this.vendedor = vendedor;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<ItemLoja> getItens() {
        return itens;
    }

    public void setItens(List<ItemLoja> itens) {
        this.itens = itens;
    }
}
