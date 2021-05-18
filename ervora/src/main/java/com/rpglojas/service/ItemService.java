package com.rpglojas.service;

import com.rpglojas.models.Item;
import com.rpglojas.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

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
}
