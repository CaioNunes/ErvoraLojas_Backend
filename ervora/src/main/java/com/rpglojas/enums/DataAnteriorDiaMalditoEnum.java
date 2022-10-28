package com.rpglojas.enums;

import com.rpglojas.dtos.DataDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DataAnteriorDiaMalditoEnum {

    QUARTO_RESTO_EREBOS(1, new DataDTO(SemanaEnum.QUARTO, DiaEnum.RESTO, MesEnum.EREBOS)),
    QUARTO_RESTO_KARAMETRA(2, new DataDTO(SemanaEnum.QUARTO, DiaEnum.RESTO, MesEnum.KARAMETRA)),
    QUARTO_RESTO_KRUPHIX(3, new DataDTO(SemanaEnum.QUARTO, DiaEnum.RESTO, MesEnum.KRUPHIX)),
    QUARTO_RESTO_PHARIKA(4, new DataDTO(SemanaEnum.QUARTO, DiaEnum.RESTO, MesEnum.PHARIKA)),
    QUARTO_RESTO_THASSA(5, new DataDTO(SemanaEnum.QUARTO, DiaEnum.RESTO, MesEnum.THASSA));

    private Integer numero;
    private DataDTO data;

    public static DataAnteriorDiaMalditoEnum findByNumero(Integer numero){

        for(DataAnteriorDiaMalditoEnum dia : values()){
            if(dia.getNumero().equals(numero))  {
                return dia;
            }
        }

        return null;
    }
}
