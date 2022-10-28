package com.rpglojas.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ParDataDTO {

    private DataDTO dataAnterior;
    private DataDTO dataPosterior;

}
