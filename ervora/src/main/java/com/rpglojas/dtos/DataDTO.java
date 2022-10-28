package com.rpglojas.dtos;

import com.rpglojas.enums.DiaEnum;
import com.rpglojas.enums.MesEnum;
import com.rpglojas.enums.SemanaEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DataDTO {

    private SemanaEnum semana;
    private DiaEnum dia;
    private MesEnum mes;
    private Integer ano;
    private boolean diaMaldito;

    public DataDTO(SemanaEnum semana, DiaEnum dia, MesEnum mes, Integer ano) {
        this.semana = semana;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public DataDTO(SemanaEnum semana, DiaEnum dia, MesEnum mes) {
        this.semana = semana;
        this.dia = dia;
        this.mes = mes;
    }
}
