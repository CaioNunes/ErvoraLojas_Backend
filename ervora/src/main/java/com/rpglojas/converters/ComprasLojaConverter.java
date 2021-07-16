package com.rpglojas.converters;

import com.rpglojas.dtos.ComprasLojaDTO;
import com.rpglojas.dtos.PersonagemDTO;
import com.rpglojas.models.ComprasLoja;
import com.rpglojas.models.Personagem;

public class ComprasLojaConverter implements BaseConverter<ComprasLoja, ComprasLojaDTO> {


    @Override
    public ComprasLoja convertToEntity(ComprasLojaDTO dto) {
        ComprasLoja compra = new ComprasLoja();
        compra.setId(dto.getId());
        compra.setComprador(new PersonagemConverter().convertToEntity(dto.getComprador()));
        compra.setItemAdquirido(new ItemLojaConverter().convertToEntity(dto.getItemAdquirido()));
        compra.setQuantidadeAdquirida(dto.getQuantidadeAdquirida());

        return compra;
    }

    @Override
    public ComprasLojaDTO convertToDTO(ComprasLoja entity) {
        ComprasLojaDTO dto = new ComprasLojaDTO();

        dto.setId(entity.getId());
        dto.setComprador(new PersonagemConverter().convertToDTO(entity.getComprador()));
        dto.setItemAdquirido(new ItemLojaConverter().convertToDTO(entity.getItemAdquirido()));
        dto.setQuantidadeAdquirida(entity.getQuantidadeAdquirida());

        return dto;
    }
}
