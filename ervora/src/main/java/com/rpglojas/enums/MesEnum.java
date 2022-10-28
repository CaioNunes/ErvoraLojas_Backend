package com.rpglojas.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MesEnum {

    ATHREOS(1, "Athreos"),
    EPHARA(2, "Ephara"),
    EREBOS(3, "Erebos"),
    HELIOD(4, "Heliod"),
    IROAS(5, "Iroas"),
    KARAMETRA(6, "Karametra"),
    KERANOS(7, "Keranos"),
    KLOTHYS(8, "Klothys"),
    KRUPHIX(9, "Kruphix"),
    MOGIS(10, "Mogis"),
    NYLEA(11, "Nylea"),
    PHARIKA(12, "Pharika"),
    PHENAX(13, "Phenax"),
    PURPHOROS(14, "Purphoros"),
    THASSA(15, "Thassa"),
    MES_MALDITO(16, "Dia Maldito");

    private Integer numero;
    private String descricao;

    public static MesEnum findByNumero(Integer numero){

        for(MesEnum mes : values()){
            if(mes.getNumero().equals(numero))  {
                return mes;
            }
        }

        return null;
    }
}
