package com.rpglojas.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SemanaEnum {

    PRIMO(1, "Primo"),
    SECONDO(2, "Secondo"),
    TERZO(3, "Terzo"),
    QUARTO(4, "Quarto"),
    SEMANA_MALDITO(5, "Dia Maldito");

    private Integer numero;
    private String descricao;

    public static SemanaEnum findByNumero(Integer numero){

        for(SemanaEnum semana : values()){
            if(semana.getNumero().equals(numero))  {
                return semana;
            }
        }

        return null;
    }

}
