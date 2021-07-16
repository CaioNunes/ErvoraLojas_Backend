package com.rpglojas.converters;

import com.rpglojas.dtos.CidadeDTO;
import com.rpglojas.models.Cidade;

public class CidadeConverter implements BaseConverter<Cidade, CidadeDTO> {


    @Override
    public Cidade convertToEntity(CidadeDTO dto) {
        Cidade cidade = new Cidade();
        cidade.setId(dto.getId());
        cidade.setNome(dto.getNome());
        cidade.setTesouro(dto.getTesouro());

        return cidade;
    }


    @Override
    public CidadeDTO convertToDTO(Cidade p){
        CidadeDTO dto = new CidadeDTO();

        dto.setId(p.getId());
        dto.setNome(p.getNome());
        dto.setTesouro(p.getTesouro());

        return dto;
    }
}
