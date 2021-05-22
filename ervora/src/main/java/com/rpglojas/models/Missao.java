package com.rpglojas.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "MISSAO")
public class Missao {

    @Id
    @GeneratedValue
    @Column(name = "id_missao")
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "recompensa_total")
    private BigDecimal recompensaTotal;

    @Column(name = "data_missao")
    private Date dataMissao;

    @ManyToOne
    @JoinColumn(name = "id_responsavel")
    private Personagem personagemResponsavel;

    @OneToMany(mappedBy = "idMissao", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<PersonagemMissao> participantes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getRecompensaTotal() {
        return recompensaTotal;
    }

    public void setRecompensaTotal(BigDecimal recompensaTotal) {
        this.recompensaTotal = recompensaTotal;
    }

    public Date getDataMissao() {
        return dataMissao;
    }

    public void setDataMissao(Date dataMissao) {
        this.dataMissao = dataMissao;
    }

    public Personagem getPersonagemResponsavel() {
        return personagemResponsavel;
    }

    public void setPersonagemResponsavel(Personagem personagemResponsavel) {
        this.personagemResponsavel = personagemResponsavel;
    }

    public List<PersonagemMissao> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<PersonagemMissao> participantes) {
        this.participantes = participantes;
    }
}


