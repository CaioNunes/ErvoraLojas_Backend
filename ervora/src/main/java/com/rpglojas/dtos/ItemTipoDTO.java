package com.rpglojas.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class ItemTipoDTO {

    private Long id;

    @NotBlank
    private String descricao;
}
