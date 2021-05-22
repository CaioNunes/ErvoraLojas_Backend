package com.rpglojas.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "PERSONAGEM_MISSAO")
public class PersonagemMissao {

    @Id
    @GeneratedValue
    @Column(name = "id_personagem_missao")
    private Long id;

    @Column(name = "id_personagem")
    private Long idPersonagem;

    @Column(name = "id_missao")
    private Long idMissao;

    @Column(name = "recompensa_recebida")
    private BigDecimal recompensaRecebida;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPersonagem() {
        return idPersonagem;
    }

    public void setIdPersonagem(Long personagem) {
        this.idPersonagem = personagem;
    }

    public Long getIdMissao() {
        return idMissao;
    }

    public void setIdMissao(Long missao) {
        this.idMissao = missao;
    }

    public BigDecimal getRecompensaRecebida() {
        return recompensaRecebida;
    }

    public void setRecompensaRecebida(BigDecimal recompensaRecebida) {
        this.recompensaRecebida = recompensaRecebida;
    }
}
