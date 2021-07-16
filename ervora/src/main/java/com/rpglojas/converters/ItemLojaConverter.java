package com.rpglojas.converters;

import com.rpglojas.dtos.ItemLojaDTO;
import com.rpglojas.models.ItemLoja;

public class ItemLojaConverter implements BaseConverter<ItemLoja, ItemLojaDTO> {
    @Override
    public ItemLoja convertToEntity(ItemLojaDTO dto) {
        ItemLoja item = new ItemLoja();

        item.setId(dto.getId());
        item.setItem(new ItemConverter().convertToEntity(dto.getItem()));
        item.setLoja(new LojaConverter().convertToEntity(dto.getLoja()));
        item.setPreco(dto.getPreco());
        item.setQuantidade(dto.getQuantidade());

        return item;
    }

    @Override
    public ItemLojaDTO convertToDTO(ItemLoja entity) {
        ItemLojaDTO dto = new ItemLojaDTO();

        dto.setId(entity.getId());
        dto.setItem(new ItemConverter().convertToDTO(entity.getItem()));
        dto.setLoja(new LojaConverter().convertToDTO(entity.getLoja()));
        dto.setPreco(entity.getPreco());
        dto.setQuantidade(entity.getQuantidade());

        return dto;
    }
}
