package com.rpglojas.service;

import com.rpglojas.converters.ItemConverter;
import com.rpglojas.dtos.ItemDTO;
import com.rpglojas.models.Item;
import com.rpglojas.repository.ItemRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<Item> getItens(){
        return itemRepository.findAll();
    }

    public Item getItem(Long id){
        Optional<Item> itemData = itemRepository.findById(id);

        if(itemData.isPresent()) {
            return itemData.get();
        } else {
            return null;

        }
    }

    public void cadastrarItem(ItemDTO item) {
        Item entity = modelMapper.map(item, Item.class);

        itemRepository.save(entity);
    }
}
