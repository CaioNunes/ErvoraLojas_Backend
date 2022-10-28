package com.rpglojas.enums;

import lombok.Getter;
import lombok.Setter;

@Getter
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

    public static TipoItemEnum findByCodigo(Long codigo){

        for(TipoItemEnum tipo : values()){
            if(tipo.getCodigo().equals(codigo))  {
                return tipo;
            }
        }

        return null;
    }
}
