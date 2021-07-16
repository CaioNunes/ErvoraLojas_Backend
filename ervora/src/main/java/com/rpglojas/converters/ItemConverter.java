package com.rpglojas.converters;

import com.rpglojas.dtos.ItemDTO;
import com.rpglojas.dtos.ItemLojaDTO;
import com.rpglojas.models.Item;
import com.rpglojas.models.ItemLoja;

public class ItemConverter implements BaseConverter<Item, ItemDTO> {

    @Override
    public Item convertToEntity(ItemDTO dto) {
        Item item = new Item();

        item.setId(dto.getId());
        item.setNome(dto.getNome());
        item.setDescricao(dto.getDescricao());
        //todo
        item.setQualidadeItem(null);
        item.setTipoItem(null);
        item.setPeso(dto.getPeso());

        return item;
    }

    @Override
    public ItemDTO convertToDTO(Item entity) {
        ItemDTO dto = new ItemDTO();

        dto.setId(entity.getId());
        dto.setNome(entity.getNome());
        dto.setDescricao(entity.getDescricao());
        dto.setCodQualidadeItem(entity.getQualidadeItem().getId());
        dto.setCodTipoItem(entity.getTipoItem().getId());
        dto.setPeso(entity.getPeso());

        return dto;
    }
}
