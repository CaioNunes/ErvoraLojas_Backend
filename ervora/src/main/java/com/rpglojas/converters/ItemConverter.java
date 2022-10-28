package com.rpglojas.converters;

import com.rpglojas.dtos.ItemDTO;
import com.rpglojas.enums.QualidadeItemEnum;
import com.rpglojas.enums.TipoItemEnum;
import com.rpglojas.models.Item;
import com.rpglojas.models.ItemQualidade;
import com.rpglojas.models.ItemTipo;
import com.rpglojas.repository.ItemQualidadeRepository;
import com.rpglojas.repository.ItemTipoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.Optional;

public class ItemConverter implements BaseConverter<Item, ItemDTO> {

    @Autowired
    ItemQualidadeRepository qualidadeItemRepository;

    @Autowired
    ItemTipoRepository itemTipoRepository;

    @Override
    @Transactional
    public Item convertToEntity(ItemDTO dto) {
        Item item = new Item();

        item.setId(dto.getId());
        item.setNome(dto.getNome());
        item.setDescricao(dto.getDescricao());
        item.setPeso(dto.getPeso());

        return item;
    }

    @Override
    public ItemDTO convertToDTO(Item entity) {
        ItemDTO dto = new ItemDTO();

        dto.setId(entity.getId());
        dto.setNome(entity.getNome());
        dto.setDescricao(entity.getDescricao());
        dto.setPeso(entity.getPeso());

        return dto;
    }
}
