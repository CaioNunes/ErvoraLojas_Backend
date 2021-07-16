package com.rpglojas.converters;

import com.rpglojas.dtos.ItemDTO;
import com.rpglojas.dtos.LojaDTO;
import com.rpglojas.models.Cidade;
import com.rpglojas.models.Item;
import com.rpglojas.models.Loja;

public class LojaConverter implements BaseConverter<Loja, LojaDTO> {

    @Override
    public Loja convertToEntity(LojaDTO dto) {
        Loja loja = new Loja();

        loja.setId(dto.getId());
        loja.setVendedor(new PersonagemConverter().convertToEntity(dto.getVendedor()));
        loja.setCidade(new CidadeConverter().convertToEntity(dto.getCidade()));
        loja.setNome(dto.getNome());

        return loja;
    }

    @Override
    public LojaDTO convertToDTO(Loja entity) {
        LojaDTO dto = new LojaDTO();

        dto.setId(entity.getId());
        dto.setVendedor(new PersonagemConverter().convertToDTO(entity.getVendedor()));
        dto.setCidade(new CidadeConverter().convertToDTO(entity.getCidade()));
        dto.setNome(entity.getNome());

        return dto;
    }
}
