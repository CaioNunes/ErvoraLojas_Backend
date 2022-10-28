package com.rpglojas.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DiaEnum {

    PRIMO(1, "Primo"),
    SECONDO(2, "Secondo"),
    TERZO(3, "Terzo"),
    QUARTO(4, "Quarto"),
    QUINTO(5, "Quinto"),
    RESTO(6, "Resto"),
    DIA_MALDITO(7, "Dia Maldito");

    private Integer numero;
    private String descricao;

    public static DiaEnum findByNumero(Integer numero){

        for(DiaEnum dia : values()){
            if(dia.getNumero().equals(numero))  {
                return dia;
            }
        }

        return null;
    }
}
