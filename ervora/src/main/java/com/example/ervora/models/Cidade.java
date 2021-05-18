package com.example.ervora.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "CIDADE")
public class Cidade {

    @Id
    @GeneratedValue
    @Column(name = "id_cidade")
    private Long id;

    @Column(name = "tesouro")
    private BigDecimal tesouro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTesouro() {
        return tesouro;
    }

    public void setTesouro(BigDecimal tesouro) {
        this.tesouro = tesouro;
    }
}
