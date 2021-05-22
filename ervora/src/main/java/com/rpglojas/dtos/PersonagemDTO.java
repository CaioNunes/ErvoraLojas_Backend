package com.rpglojas.dtos;

import com.rpglojas.models.Cidade;

import java.io.Serializable;
import java.math.BigDecimal;

public class PersonagemDTO implements Serializable {

    private Long id;
    private String nome;
    private BigDecimal tesouro;
    private CidadeDTO cidade;
    private Boolean isNpc;
    private Boolean isParticipanteGuilda;
    //private List<Missoes> missoes;

    public PersonagemDTO(Long id, String nome, BigDecimal tesouro, Long cidadeId, String cidadeNome, BigDecimal cidadeTesouro, Boolean isNpc, Boolean isParticipanteGuilda){
        this.id = id;
        this.nome = nome;
        this.tesouro = tesouro;
        CidadeDTO cidadeDTO = new CidadeDTO(cidadeId, cidadeNome, cidadeTesouro);
        this.cidade = cidadeDTO;
        this.isNpc = isNpc;
        this.isParticipanteGuilda = isParticipanteGuilda;
    }

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

    public CidadeDTO getCidade() {
        return cidade;
    }

    public void setCidade(CidadeDTO cidade) {
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
}
