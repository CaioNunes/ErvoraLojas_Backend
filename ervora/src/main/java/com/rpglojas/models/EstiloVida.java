package com.rpglojas.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ESTILO_VIDA")
public class EstiloVida {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "custo_vida_semanal")
    private BigDecimal custoVidaSemanal;

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

    public BigDecimal getCustoVidaSemanal() {
        return custoVidaSemanal;
    }

    public void setCustoVidaSemanal(BigDecimal custoVidaSemanal) {
        this.custoVidaSemanal = custoVidaSemanal;
    }
}
