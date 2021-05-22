package com.rpglojas.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "PERSONAGEM")
public class Personagem implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_personagem")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "tesouro")
    private BigDecimal tesouro;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Cidade cidade;

    @Column(name = "is_npc")
    private Boolean isNpc;

    @Column(name = "is_participante_guilda")
    private Boolean isParticipanteGuilda;

    @OneToMany(mappedBy = "idPersonagem", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<PersonagemMissao> missoes;

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

    public BigDecimal getTesouro() {
        return tesouro;
    }

    public void setTesouro(BigDecimal tesouro) {
        this.tesouro = tesouro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Boolean getNpc() {
        return isNpc;
    }

    public void setNpc(Boolean npc) {
        isNpc = npc;
    }

    public Boolean getParticipanteGuilda() {
        return isParticipanteGuilda;
    }

    public void setParticipanteGuilda(Boolean participanteGuilda) {
        isParticipanteGuilda = participanteGuilda;
    }

    public List<PersonagemMissao> getMissoes() {
        return missoes;
    }

    public void setMissoes(List<PersonagemMissao> missoes) {
        this.missoes = missoes;
    }
}
