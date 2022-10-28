package com.rpglojas.models;

import com.rpglojas.enums.TipoItemEnum;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class PorcentagemGastosEstiloVida {

    @Id
    @GeneratedValue
    @Column(name = "id_porcentagem_gastos_estilo_vida")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_tipo_item")
    private ItemTipo tipoItem;

    @ManyToOne
    @JoinColumn(name = "id_estilo_vida")
    private EstiloVida estiloVida;

    @Column(name = "percentual_gasto")
    private BigDecimal percentualGasto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ItemTipo getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(ItemTipo tipoItem) {
        this.tipoItem = tipoItem;
    }

    public BigDecimal getPercentualGasto() {
        return percentualGasto;
    }

    public void setPercentualGasto(BigDecimal percentualGasto) {
        this.percentualGasto = percentualGasto;
    }

    public EstiloVida getEstiloVida() {
        return estiloVida;
    }

    public void setEstiloVida(EstiloVida estiloVida) {
        this.estiloVida = estiloVida;
    }
}
