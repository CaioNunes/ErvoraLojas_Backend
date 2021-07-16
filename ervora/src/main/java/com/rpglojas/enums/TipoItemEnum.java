package com.rpglojas.enums;

public enum TipoItemEnum {

    ALIMENTOS(1l, "Alimentos"),
    TRANSPORTE(2l, "Transporte"),
    ACADEMICO(3l, "Acadêmico"),
    AGRICULTURA(4l, "Agricultura"),
    CASA(5l, "Casa"),
    EQUIPAMENTO(6l, "Equipamento"),
    LUXO(7l, "Luxo");

    private Long codigo;
    private String descricao;

    TipoItemEnum(Long codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoItemEnum findByCodigo(Long codigo){

        for(TipoItemEnum tipo : values()){
            if(tipo.getCodigo().equals(codigo))  {
                return tipo;
            }
        }

        return null;
    }
}
