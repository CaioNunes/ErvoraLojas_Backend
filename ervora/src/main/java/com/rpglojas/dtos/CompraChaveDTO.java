package com.rpglojas.dtos;

public class CompraChaveDTO {

    private Long idComprador;
    private Long idItemLoja;
    private Integer qntAdquirida;

    public Long getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(Long idComprador) {
        this.idComprador = idComprador;
    }

    public Long getIdItemLoja() {
        return idItemLoja;
    }

    public void setIdItemLoja(Long idItemLoja) {
        this.idItemLoja = idItemLoja;
    }

    public Integer getQntAdquirida() {
        return qntAdquirida;
    }

    public void setQntAdquirida(Integer qntAdquirida) {
        this.qntAdquirida = qntAdquirida;
    }
}
