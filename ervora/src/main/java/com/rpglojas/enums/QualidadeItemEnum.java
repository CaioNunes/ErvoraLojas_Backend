package com.rpglojas.enums;

import lombok.Getter;

@Getter
public enum QualidadeItemEnum {

    BAIXA(1l, "Baixa"),
    MEDIA(2l, "Média"),
    ALTA(3l, "Alta");

    private Long codigo;
    private String descricao;

    QualidadeItemEnum(Long codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static QualidadeItemEnum findByCodigo(Long codigo){

        for(QualidadeItemEnum tipo : values()){
            if(tipo.getCodigo().equals(codigo))  {
                return tipo;
            }
        }

        return null;
    }
}
